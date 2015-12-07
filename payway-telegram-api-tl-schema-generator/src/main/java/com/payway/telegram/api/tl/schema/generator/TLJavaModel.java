/*
 * (c) Payway, 2015. All right reserved.
 */
package com.payway.telegram.api.tl.schema.generator;

import com.payway.telegram.api.tl.schema.generator.TLGeneratorModel.TLAnyTypeDef;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorModel.TLBuiltInGenericTypeDef;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorModel.TLBuiltInTypeDef;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorModel.TLCombinedTypeDef;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorModel.TLConstructorDef;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorModel.TLFunctionalTypeDef;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorModel.TLMethodDef;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorModel.TLModel;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorModel.TLParameterDef;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorModel.TLTypeDef;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TLJavaModel
 *
 * @author Sergey Kichenko
 * @created 07.12.2015
 */
public final class TLJavaModel {

    public static class JavaModel {

        private Map<String, JavaTypeObject> types;
        private List<JavaRpcMethod> methods;

        public JavaModel(Map<String, JavaTypeObject> types, List<JavaRpcMethod> methods) {
            this.types = types;
            this.methods = methods;
        }
    }

    public static class JavaTypeObject {

        private TLCombinedTypeDef tlType;

        private String javaPackage;
        private String javaTypeName;
        private List<JavaTypeConstructor> constructors;
        public List<JavaParameter> commonParameters;

        public JavaTypeObject(TLCombinedTypeDef tlType) {
            this.tlType = tlType;

            javaPackage = JavaConfigConstant.mapJavaPackage(tlType);
            javaTypeName = JavaConfigConstant.mapJavaTypeName(tlType);

            constructors = new ArrayList<>(tlType.getConstructors().size());
            for (final TLConstructorDef ctr : tlType.getConstructors()) {
                constructors.add(new JavaTypeConstructor(ctr, this));
            }

            final List<JavaParameter> parameters = new ArrayList<>();
            if (!JavaConfigConstant.IGNORE_UNITING.contains(tlType.getName())) {
                for (final JavaParameter param : constructors.get(0).getParameters()) {
                    final String pName = param.getTlParameterDef().getName();
                    final TLTypeDef pType = param.getTlParameterDef().getTypeDef();

                    for (final JavaTypeConstructor ctr : constructors) {
                        boolean hasParameter = false;
                        for (final JavaParameter jp : ctr.getParameters()) {
                            boolean areSameType = jp.getTlParameterDef().getTypeDef().getClass().equals(pType.getClass());
                            if (jp.getTlParameterDef().getName().equals(pName) && areSameType) {
                                hasParameter = true;
                                break;
                            }
                        }
                        if (!hasParameter) {
                            break;
                        }
                    }

                    parameters.add(param);
                }
            }
            commonParameters = parameters;
        }

        public TLCombinedTypeDef getTlType() {
            return tlType;
        }

        public String getJavaPackage() {
            return javaPackage;
        }

        public String getJavaTypeName() {
            return javaTypeName;
        }

        public List<JavaTypeConstructor> getConstructors() {
            return constructors;
        }

        public List<JavaParameter> getCommonParameters() {
            return commonParameters;
        }
    }

    public static abstract class JavaTypeReference {

        private TLTypeDef tlReference;
        private String javaName;

        public JavaTypeReference() {
            //
        }

        public JavaTypeReference(TLTypeDef tlReference, String javaName) {
            this.tlReference = tlReference;
            this.javaName = javaName;
        }

        public TLTypeDef getTlReference() {
            return tlReference;
        }

        public String getJavaName() {
            return javaName;
        }

        public void setTlReference(TLTypeDef tlReference) {
            this.tlReference = tlReference;
        }

        public void setJavaName(String javaName) {
            this.javaName = javaName;
        }
    }

    public static class JavaParameter {

        private TLParameterDef tlParameterDef;

        private String internalName;
        private String getterName;
        private String setterName;
        private JavaTypeReference reference;

        public JavaParameter(TLParameterDef tlParameterDef) {
            this.tlParameterDef = tlParameterDef;

            internalName = JavaConfigConstant.mapVariableBaseName(tlParameterDef);
            getterName = "get" + internalName;
            setterName = "set" + internalName;
            reference = null;
        }

        public TLParameterDef getTlParameterDef() {
            return tlParameterDef;
        }

        public String getInternalName() {
            return internalName;
        }

        public String getGetterName() {
            return getterName;
        }

        public String getSetterName() {
            return setterName;
        }

        public JavaTypeReference getReference() {
            return reference;
        }

        public void setReference(JavaTypeReference reference) {
            this.reference = reference;
        }

    }

    public static class JavaRpcMethod {

        private final TLMethodDef tlMethod;

        private String methodName;
        private String requestClassName;
        private JavaTypeReference returnReference;
        private List<JavaParameter> parameters;

        public JavaRpcMethod(TLMethodDef tlMethod) {
            this.tlMethod = tlMethod;
            methodName = JavaConfigConstant.mapJavaMethodName(tlMethod);
            requestClassName = JavaConfigConstant.mapJavaMethodClassName(tlMethod);
            returnReference = null;
            parameters = new ArrayList<>(tlMethod.getArgs().size());
            for (final TLParameterDef param : tlMethod.getArgs()) {
                parameters.add(new JavaParameter(param));
            }
        }

        public TLMethodDef getTlMethod() {
            return tlMethod;
        }

        public String getMethodName() {
            return methodName;
        }

        public String getRequestClassName() {
            return requestClassName;
        }

        public JavaTypeReference getReturnReference() {
            return returnReference;
        }

        public List<JavaParameter> getParameters() {
            return parameters;
        }

        public void setReturnReference(JavaTypeReference returnReference) {
            this.returnReference = returnReference;
        }

    }

    public static class JavaTypeConstructor {

        private final TLConstructorDef tlConstructor;
        private final JavaTypeObject javaType;

        private final String javaClassName;
        private List<JavaParameter> parameters;

        public JavaTypeConstructor(TLConstructorDef tlConstructor, JavaTypeObject javaType) {
            this.tlConstructor = tlConstructor;
            this.javaType = javaType;

            javaClassName = JavaConfigConstant.mapJavaChildName(tlConstructor);
            parameters = new ArrayList<>(tlConstructor.getParameters().size());
            for (final TLParameterDef param : tlConstructor.getParameters()) {
                parameters.add(new JavaParameter(param));
            }
        }

        public TLConstructorDef getTlConstructor() {
            return tlConstructor;
        }

        public JavaTypeObject getJavaType() {
            return javaType;
        }

        public String getJavaClassName() {
            return javaClassName;
        }

        public List<JavaParameter> getParameters() {
            return parameters;
        }

    }

    public static class JavaTypeTlReference extends JavaTypeReference {

        TLTypeDef tlReference;
        JavaTypeObject javaReference;

        public JavaTypeTlReference(TLTypeDef tlReference, JavaTypeObject javaReference) {
            super(tlReference, javaReference.getJavaPackage() + "." + javaReference.getJavaTypeName());
        }
    }

    public static class JavaTypeFunctionalReference extends JavaTypeReference {

        public JavaTypeFunctionalReference(TLTypeDef tlReference) {
            super(tlReference, "TLMethod");
        }
    }

    public static class JavaTypeAnyReference extends JavaTypeReference {

        public JavaTypeAnyReference(TLTypeDef tlReference) {
            super(tlReference, "TLObject");
        }
    }

    public static class JavaTypeUnknownReference extends JavaTypeReference {

        public JavaTypeUnknownReference(TLTypeDef tlReference) {
            super(tlReference, "?");
        }
    }

    public static class JavaTypeBuiltInReference extends JavaTypeReference {

        public JavaTypeBuiltInReference(TLBuiltInTypeDef tlReference) throws Exception {

            setTlReference(tlReference);

            if ("int".equals(tlReference.getName())) {
                setJavaName("int");
            } else if ("long".equals(tlReference.getName())) {
                setJavaName("long");
            } else if ("double".equals(tlReference.getName())) {
                setJavaName("double");
            } else if ("string".equals(tlReference.getName())) {
                setJavaName("String");
            } else if ("bytes".equals(tlReference.getName())) {
                setJavaName("TLBytes");
            } else if ("Bool".equals(tlReference.getName())) {
                setJavaName("boolean");
            } else {
                throw new Exception("Unsupported built in reference: " + tlReference.getName());
            }
        }
    }

    public static class JavaTypeVectorReference extends JavaTypeReference {

        public JavaTypeVectorReference(TLTypeDef tlReference, JavaTypeReference internalReference) throws Exception {

            setTlReference(tlReference);

            if (internalReference instanceof JavaTypeBuiltInReference) {
                if ("int".equals(internalReference.getJavaName())) {
                    setJavaName(JavaConfigConstant.JAVA_CORE_PACKAGE + ".TLIntVector");
                } else if ("long".equals(internalReference.getJavaName())) {
                    setJavaName(JavaConfigConstant.JAVA_CORE_PACKAGE + ".TLLongVector");
                } else if ("String".equals(internalReference.getJavaName())) {
                    setJavaName(JavaConfigConstant.JAVA_CORE_PACKAGE + ".TLStringVector");
                } else {
                    throw new Exception("Unsupported built in reference in vector: " + internalReference.getJavaName());
                }
            } else if (internalReference instanceof JavaTypeVectorReference) {
                setJavaName(JavaConfigConstant.JAVA_CORE_PACKAGE + ".TLVector<" + internalReference.javaName + ">");
            } else if (internalReference instanceof JavaTypeTlReference) {
                setJavaName(JavaConfigConstant.JAVA_CORE_PACKAGE + ".TLVector<" + internalReference.javaName + ">");
            } else if (internalReference instanceof JavaTypeTlReference) {
                throw new Exception("Unsupported reference in vector: " + internalReference.getJavaName());
            }
        }
    }

    public static JavaTypeReference mapReference(Map<String, JavaTypeObject> javaTypes, TLTypeDef tlType) throws Exception {
        if (tlType instanceof TLCombinedTypeDef) {
            return new JavaTypeTlReference(
                    tlType,
                    javaTypes.get(((TLCombinedTypeDef) tlType).getName())
            );
        } else if (tlType instanceof TLBuiltInTypeDef) {
            return new JavaTypeBuiltInReference((TLBuiltInTypeDef) tlType);
        } else if (tlType instanceof TLBuiltInGenericTypeDef) {
            final TLBuiltInGenericTypeDef generic = (TLBuiltInGenericTypeDef) tlType;
            if (!"Vector".equals(generic.getName())) {
                throw new Exception("Only Vector built-in generics are supported");
            }
            return new JavaTypeVectorReference(tlType, mapReference(javaTypes, ((TLBuiltInGenericTypeDef) tlType).getBasic()));
        } else if (tlType instanceof TLBuiltInTypeDef) {
            return new JavaTypeBuiltInReference((TLBuiltInTypeDef) tlType);
        } else if (tlType instanceof TLAnyTypeDef) {
            return new JavaTypeAnyReference(tlType);
        } else if (tlType instanceof TLFunctionalTypeDef) {
            return new JavaTypeFunctionalReference(tlType);
        }

        return new JavaTypeUnknownReference(tlType);
    }

    public static JavaModel convertToJavaModel(TLModel model) throws Exception {

        final Map<String, JavaTypeObject> javaTypes = new HashMap<>();

        for (final TLTypeDef t : model.getTypes()) {
            if (t instanceof TLCombinedTypeDef) {
                final TLCombinedTypeDef combinedType = (TLCombinedTypeDef) t;
                javaTypes.put(combinedType.getName(), new JavaTypeObject(combinedType));
            }
        }

        final List<JavaRpcMethod> javaMethods = new ArrayList<>();

        for (final TLMethodDef t : model.getMethods()) {
            javaMethods.add(new JavaRpcMethod(t));
        }

        for (final JavaTypeObject t : javaTypes.values()) {
            for (JavaParameter p : t.getCommonParameters()) {
                p.setReference(mapReference(javaTypes, p.getTlParameterDef().getTypeDef()));
            }
            for (final JavaTypeConstructor c : t.getConstructors()) {
                for (final JavaParameter p : c.getParameters()) {
                    p.setReference(mapReference(javaTypes, p.getTlParameterDef().getTypeDef()));
                }
            }
        }

        for (final JavaRpcMethod m : javaMethods) {
            m.setReturnReference(mapReference(javaTypes, m.getTlMethod().getReturnType()));

            for (final JavaParameter p : m.getParameters()) {
                p.setReference(mapReference(javaTypes, p.getTlParameterDef().getTypeDef()));
            }
        }

        return new JavaModel(javaTypes, javaMethods);
    }

    public static void writeJavaClasses(JavaModel model, String path) {
        //
    }
}
