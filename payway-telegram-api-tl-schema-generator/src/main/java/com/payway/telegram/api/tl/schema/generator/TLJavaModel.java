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
import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
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

        public Map<String, JavaTypeObject> getTypes() {
            return types;
        }

        public List<JavaRpcMethod> getMethods() {
            return methods;
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
            getterName = "get" + JavaConfigConstant.uCamelCase(internalName, "");
            setterName = "set" + JavaConfigConstant.uCamelCase(internalName, "");
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

        private JavaTypeReference internalReference;

        public JavaTypeVectorReference(TLTypeDef tlReference, JavaTypeReference internalReference) throws Exception {

            setTlReference(tlReference);
            setInternalReference(internalReference);

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

        public JavaTypeReference getInternalReference() {
            return internalReference;
        }

        public void setInternalReference(JavaTypeReference internalReference) {
            this.internalReference = internalReference;
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

    public static String buildSerializer(List<JavaParameter> parameters) throws Exception {

        if (parameters.isEmpty()) {
            return "";
        }

        String serializer = "";
        for (final JavaParameter p : parameters) {
            if (p.getReference() instanceof JavaTypeTlReference) {
                serializer += JavaTemplate.JAVA_SERIALIZE_OBJECT.replace("{int}", p.getInternalName());
            } else if (p.getReference() instanceof JavaTypeVectorReference) {
                serializer += JavaTemplate.JAVA_SERIALIZE_VECTOR.replace("{int}", p.getInternalName());
            } else if (p.getReference() instanceof JavaTypeBuiltInReference) {
                if ("int".equals(p.getTlParameterDef().getTypeDef().getName())) {
                    serializer += JavaTemplate.JAVA_SERIALIZE_INT.replace("{int}", p.getInternalName());
                } else if ("Bool".equals(p.getTlParameterDef().getTypeDef().getName())) {
                    serializer += JavaTemplate.JAVA_SERIALIZE_BOOLEAN.replace("{int}", p.getInternalName());
                } else if ("long".equals(p.getTlParameterDef().getTypeDef().getName())) {
                    serializer += JavaTemplate.JAVA_SERIALIZE_LONG.replace("{int}", p.getInternalName());
                } else if ("double".equals(p.getTlParameterDef().getTypeDef().getName())) {
                    serializer += JavaTemplate.JAVA_SERIALIZE_DOUBLE.replace("{int}", p.getInternalName());
                } else if ("string".equals(p.getTlParameterDef().getTypeDef().getName())) {
                    serializer += JavaTemplate.JAVA_SERIALIZE_STRING.replace("{int}", p.getInternalName());
                } else if ("bytes".equals(p.getTlParameterDef().getTypeDef().getName())) {
                    serializer += JavaTemplate.JAVA_SERIALIZE_BYTES.replace("{int}", p.getInternalName());
                } else {
                    throw new Exception("Unknown internal type: " + p.getTlParameterDef().getTypeDef().getName());
                }
            } else if (p.getReference() instanceof JavaTypeFunctionalReference) {
                serializer += JavaTemplate.JAVA_SERIALIZE_FUNCTIONAL.replace("{int}", p.getInternalName());
            } else if (p.getReference() instanceof JavaTypeAnyReference) {
                serializer += JavaTemplate.JAVA_SERIALIZE_OBJECT.replace("{int}", p.getInternalName());
            } else {
                throw new Exception("Unknown type: " + p.getTlParameterDef().getTypeDef().getName());
            }
        }

        return JavaTemplate.JAVA_SERIALIZE_TEMPLATE.replace("{body}", serializer);
    }

    public static String buildDeserializer(List<JavaParameter> parameters) throws Exception {

        if (parameters.isEmpty()) {
            return "";
        }

        String serializer = "";
        for (final JavaParameter p : parameters) {
            if (p.getReference() instanceof JavaTypeTlReference) {
                serializer += JavaTemplate.JAVA_DESERIALIZE_OBJECT.replace("{int}", p.getInternalName())
                        .replace("{type}", ((JavaTypeTlReference) p.getReference()).getJavaName());
            } else if (p.getReference() instanceof JavaTypeVectorReference) {
                if (((JavaTypeVectorReference) p.getReference()).getInternalReference() instanceof JavaTypeBuiltInReference) {
                    JavaTypeBuiltInReference intReference = (JavaTypeBuiltInReference) ((JavaTypeVectorReference) p.getReference()).getInternalReference();
                    if ("int".equals(intReference.getJavaName())) {
                        serializer += JavaTemplate.JAVA_DESERIALIZE_INT_VECTOR.replace("{int}", p.getInternalName());
                    } else if ("long".equals(intReference.getJavaName())) {
                        serializer += JavaTemplate.JAVA_DESERIALIZE_LONG_VECTOR.replace("{int}", p.getInternalName());
                    } else if ("String".equals(intReference.getJavaName())) {
                        serializer += JavaTemplate.JAVA_DESERIALIZE_STRING_VECTOR.replace("{int}", p.getInternalName());
                    } else {
                        serializer += JavaTemplate.JAVA_DESERIALIZE_VECTOR.replace("{int}", p.getInternalName());
                    }
                } else {
                    serializer += JavaTemplate.JAVA_DESERIALIZE_VECTOR.replace("{int}", p.getInternalName());
                }
            } else if (p.getReference() instanceof JavaTypeBuiltInReference) {
                if ("int".equals(p.getTlParameterDef().getTypeDef().getName())) {
                    serializer += JavaTemplate.JAVA_DESERIALIZE_INT.replace("{int}", p.getInternalName());
                } else if ("Bool".equals(p.getTlParameterDef().getTypeDef().getName())) {
                    serializer += JavaTemplate.JAVA_DESERIALIZE_BOOLEAN.replace("{int}", p.getInternalName());
                } else if ("long".equals(p.getTlParameterDef().getTypeDef().getName())) {
                    serializer += JavaTemplate.JAVA_DESERIALIZE_LONG.replace("{int}", p.getInternalName());
                } else if ("double".equals(p.getTlParameterDef().getTypeDef().getName())) {
                    serializer += JavaTemplate.JAVA_DESERIALIZE_DOUBLE.replace("{int}", p.getInternalName());
                } else if ("string".equals(p.getTlParameterDef().getTypeDef().getName())) {
                    serializer += JavaTemplate.JAVA_DESERIALIZE_STRING.replace("{int}", p.getInternalName());
                } else if ("bytes".equals(p.getTlParameterDef().getTypeDef().getName())) {
                    serializer += JavaTemplate.JAVA_DESERIALIZE_BYTES.replace("{int}", p.getInternalName());
                } else {
                    throw new Exception("Unknown internal type: " + p.getTlParameterDef().getTypeDef().getName());
                }
            } else if (p.getReference() instanceof JavaTypeFunctionalReference) {
                serializer += JavaTemplate.JAVA_DESERIALIZE_FUNCTIONAL.replace("{int}", p.getInternalName());
            } else if (p.getReference() instanceof JavaTypeAnyReference) {
                serializer += JavaTemplate.JAVA_DESERIALIZE_OBJECT.replace("{int}", p.getInternalName())
                        .replace("{type}", "TLObject");
            } else {
                throw new Exception("Unknown type: " + p.getTlParameterDef().getTypeDef().getName());
            }
        }

        return JavaTemplate.JAVA_DESERIALIZE_TEMPLATE.replace("{body}", serializer);
    }

    public static void writeJavaClasses(JavaModel model, String path) throws Exception {

        String generatedFile;
        String fields;
        String getterSetter;
        String directory;

        for (final JavaTypeObject t : model.getTypes().values()) {

            if (t.getConstructors().size() == 1 && !TLConstant.IGNORED_TYPES.contains(t.getTlType().getName())) {
                generatedFile = JavaTemplate.JAVA_CLASS_TEMPLATE;
                generatedFile = generatedFile
                        .replace("{name}", t.getJavaTypeName())
                        .replace("{package}", t.getJavaPackage())
                        .replace("{class_id}", "0x" + Integer.toHexString(t.getConstructors().get(0).getTlConstructor().getId()))
                        .replace("{to_string}",
                                JavaTemplate.JAVA_TO_STRING_TEMPLATE.replace("{value}", t.getConstructors().get(0).getTlConstructor().getName()
                                        + "#"
                                        + Integer.toHexString(t.getConstructors().get(0).getTlConstructor().getId())));

                fields = "";
                for (final JavaParameter p : t.getConstructors().get(0).getParameters()) {
                    fields += JavaTemplate.JAVA_FIELD_TEMPLATE
                            .replace("{type}", p.getReference().getJavaName())
                            .replace("{int}", p.getInternalName());
                }

                generatedFile = generatedFile.replace("{fields}", fields);

                getterSetter = "";
                for (final JavaParameter p : t.getConstructors().get(0).getParameters()) {
                    getterSetter += JavaTemplate.JAVA_GETTER_SETTER_TEMPLATE
                            .replace("{type}", p.getReference().getJavaName())
                            .replace("{int}", p.getInternalName())
                            .replace("{getter}", p.getGetterName())
                            .replace("{setter}", p.getSetterName());
                }

                if (t.getConstructors().get(0).getParameters().size() > 0) {
                    String constructorArgs = "";
                    String constructorBody = "";
                    for (final JavaParameter p : t.getConstructors().get(0).getParameters()) {
                        if (!"".equals(constructorArgs)) {
                            constructorArgs += ", ";
                        }

                        constructorArgs += JavaTemplate.JAVA_CONSTRUCTOR_ARG_TEMPLATE
                                .replace("{type}", p.getReference().getJavaName())
                                .replace("{int}", p.getInternalName());

                        constructorBody += JavaTemplate.JAVA_CONSTRUCTOR_BODY_TEMPLATE
                                .replace("{type}", p.getReference().getJavaName())
                                .replace("{int}", p.getInternalName());
                    }
                    generatedFile = generatedFile.replace("{constructor}",
                            JavaTemplate.JAVA_CONSTRUCTOR_TEMPLATE
                            .replace("{name}", t.getJavaTypeName())
                            .replace("{args}", constructorArgs)
                            .replace("{body}", constructorBody));
                } else {
                    generatedFile = generatedFile.replace("{constructor}", "");
                }

                generatedFile = generatedFile.replace("{getter-setters}", getterSetter);
                generatedFile = generatedFile.replace("{serialize}", buildSerializer(t.getConstructors().get(0).getParameters()));
                generatedFile = generatedFile.replace("{deserialize}", buildDeserializer(t.getConstructors().get(0).getParameters()));

                directory = path + t.getJavaPackage().replace(".", "/");
                new File(directory).mkdirs();
                Files.write(
                        Paths.get(new File(directory + "/" + t.getJavaTypeName() + ".java").toURI()),
                        generatedFile.getBytes(Charset.forName("utf-8")),
                        StandardOpenOption.CREATE
                );
            } else {

                generatedFile = JavaTemplate.JAVA_ABS_CLASS_TEMPLATE;
                generatedFile = generatedFile
                        .replace("{name}", t.getJavaTypeName())
                        .replace("{package}", t.getJavaPackage());

                fields = "";
                for (final JavaParameter p : t.getCommonParameters()) {
                    fields += JavaTemplate.JAVA_FIELD_TEMPLATE
                            .replace("{type}", p.getReference().getJavaName())
                            .replace("{int}", p.getInternalName());
                }

                generatedFile = generatedFile.replace("{fields}", fields);

                getterSetter = "";
                for (final JavaParameter p : t.getCommonParameters()) {
                    getterSetter += JavaTemplate.JAVA_GETTER_SETTER_TEMPLATE
                            .replace("{type}", p.getReference().getJavaName())
                            .replace("{int}", p.getInternalName())
                            .replace("{getter}", p.getGetterName())
                            .replace("{setter}", p.getSetterName());
                }

                generatedFile = generatedFile.replace("{getter-setters}", getterSetter);

                directory = path + t.getJavaPackage().replace(".", "/");
                new File(directory).mkdirs();
                Files.write(
                        Paths.get(new File(directory + "/" + t.getJavaTypeName() + ".java").toURI()),
                        generatedFile.getBytes(Charset.forName("utf-8")),
                        StandardOpenOption.CREATE
                );

                for (final JavaTypeConstructor constr : t.getConstructors()) {
                    generatedFile = JavaTemplate.JAVA_CHILD_CLASS_TEMPLATE;
                    generatedFile = generatedFile
                            .replace("{name}", constr.javaClassName)
                            .replace("{base-name}", t.javaTypeName)
                            .replace("{package}", t.javaPackage)
                            .replace("{class_id}", "0x" + Integer.toHexString(constr.getTlConstructor().getId()))
                            .replace("{to_string}",
                                    JavaTemplate.JAVA_TO_STRING_TEMPLATE.replace(
                                            "{value}",
                                            constr.getTlConstructor().getName() + "#" + Integer.toHexString(constr.getTlConstructor().getId())
                                    ));

                    fields = "";
                    for (final JavaParameter p : constr.getParameters()) {
                        boolean skip = false;
                        for (final JavaParameter x : t.getCommonParameters()) {
                            if (x.getInternalName().equals(p.getInternalName())) {
                                skip = true;
                                break;
                            }
                        }

                        if (skip) {
                            continue;
                        }

                        fields += JavaTemplate.JAVA_FIELD_TEMPLATE
                                .replace("{type}", p.getReference().getJavaName())
                                .replace("{int}", p.getInternalName());
                    }

                    generatedFile = generatedFile.replace("{fields}", fields);

                    getterSetter = "";
                    for (final JavaParameter p : constr.getParameters()) {

                        boolean skip = false;
                        for (final JavaParameter x : t.getCommonParameters()) {
                            if (x.getInternalName().equals(p.getInternalName())) {
                                skip = true;
                                break;
                            }
                        }

                        if (skip) {
                            continue;
                        }

                        getterSetter += JavaTemplate.JAVA_GETTER_SETTER_TEMPLATE
                                .replace("{type}", p.getReference().getJavaName())
                                .replace("{int}", p.getInternalName())
                                .replace("{getter}", p.getGetterName())
                                .replace("{setter}", p.getSetterName());
                    }

                    if (constr.getParameters().size() > 0) {
                        String constructorArgs = "";
                        String constructorBody = "";
                        for (final JavaParameter p : constr.getParameters()) {
                            if (!"".equals(constructorArgs)) {
                                constructorArgs += ", ";
                            }

                            constructorArgs += JavaTemplate.JAVA_CONSTRUCTOR_ARG_TEMPLATE
                                    .replace("{type}", p.getReference().getJavaName())
                                    .replace("{int}", p.getInternalName());

                            constructorBody += JavaTemplate.JAVA_CONSTRUCTOR_BODY_TEMPLATE
                                    .replace("{type}", p.getReference().getJavaName())
                                    .replace("{int}", p.getInternalName());
                        }

                        String constructor = JavaTemplate.JAVA_CONSTRUCTOR_TEMPLATE
                                .replace("{name}", constr.getJavaClassName())
                                .replace("{args}", constructorArgs)
                                .replace("{body}", constructorBody);

                        generatedFile = generatedFile.replace("{constructor}", constructor);

                    } else {
                        generatedFile = generatedFile.replace("{constructor}", "");
                    }

                    generatedFile = generatedFile.replace("{getter-setters}", getterSetter);

                    generatedFile = generatedFile.replace("{serialize}", buildSerializer(constr.parameters));
                    generatedFile = generatedFile.replace("{deserialize}", buildDeserializer(constr.parameters));

                    directory = path + t.getJavaPackage().replace(".", "/");
                    new File(directory).mkdirs();
                    Files.write(
                            Paths.get(new File(directory + "/" + constr.getJavaClassName() + ".java").toURI()),
                            generatedFile.getBytes(Charset.forName("utf-8")),
                            StandardOpenOption.CREATE
                    );
                }
            }
        }

        for (final JavaRpcMethod m : model.getMethods()) {
            generatedFile = JavaTemplate.JAVA_METHOD_TEMPLATE;
            String returnTypeName = m.getReturnReference().getJavaName();
            if ("boolean".equals(returnTypeName)) {
                returnTypeName = JavaConfigConstant.JAVA_CORE_PACKAGE + ".TLBool";
            }

            generatedFile = generatedFile
                    .replace("{name}", m.getRequestClassName())
                    .replace("{package}", JavaConfigConstant.JAVA_PACKAGE + "." + JavaConfigConstant.JAVA_METHOD_PACKAGE)
                    .replace("{class_id}", "0x" + Integer.toHexString(m.getTlMethod().getId()))
                    .replace("{return_type}", returnTypeName)
                    .replace("{to_string}",
                            JavaTemplate.JAVA_TO_STRING_TEMPLATE.replace("{value}", m.getTlMethod().getName() + "#" + Integer.toHexString(m.getTlMethod().getId())));

            fields = "";
            for (final JavaParameter p : m.getParameters()) {
                fields += JavaTemplate.JAVA_FIELD_TEMPLATE
                        .replace("{type}", p.getReference().getJavaName())
                        .replace("{int}", p.getInternalName());
            }

            generatedFile = generatedFile.replace("{fields}", fields);

            getterSetter = "";
            for (final JavaParameter p : m.getParameters()) {
                getterSetter += JavaTemplate.JAVA_GETTER_SETTER_TEMPLATE
                        .replace("{type}", p.getReference().getJavaName())
                        .replace("{int}", p.getInternalName())
                        .replace("{getter}", p.getGetterName())
                        .replace("{setter}", p.getSetterName());
            }

            if (m.getParameters().size() > 0) {
                String constructorArgs = "";
                String constructorBody = "";
                for (final JavaParameter p : m.getParameters()) {
                    if (!"".equals(constructorArgs)) {
                        constructorArgs += ", ";
                    }

                    constructorArgs += JavaTemplate.JAVA_CONSTRUCTOR_ARG_TEMPLATE
                            .replace("{type}", p.getReference().getJavaName())
                            .replace("{int}", p.getInternalName());

                    constructorBody += JavaTemplate.JAVA_CONSTRUCTOR_BODY_TEMPLATE
                            .replace("{type}", p.getReference().getJavaName())
                            .replace("{int}", p.getInternalName());
                }

                String constructor = JavaTemplate.JAVA_CONSTRUCTOR_TEMPLATE
                        .replace("{name}", m.requestClassName)
                        .replace("{args}", constructorArgs)
                        .replace("{body}", constructorBody);

                generatedFile = generatedFile.replace("{constructor}", constructor);

            } else {
                String constructor = JavaTemplate.JAVA_CONSTRUCTOR_TEMPLATE
                        .replace("{name}", m.getRequestClassName())
                        .replace("{args}", "")
                        .replace("{body}", "");

                generatedFile = generatedFile.replace("{constructor}", constructor);
            }

            generatedFile = generatedFile.replace("{getter-setters}", getterSetter);
            generatedFile = generatedFile.replace("{serialize}", buildSerializer(m.getParameters()));
            generatedFile = generatedFile.replace("{deserialize}", buildDeserializer(m.getParameters()));

            String responseParser = JavaTemplate.JAVA_METHOD_PARSER_TEMPLATE.replace("{return_type}", returnTypeName);
            if (m.getReturnReference() instanceof JavaTypeVectorReference) {

                JavaTypeVectorReference vectorReference = (JavaTypeVectorReference) m.getReturnReference();

                if (vectorReference.getInternalReference() instanceof JavaTypeBuiltInReference) {

                    JavaTypeBuiltInReference intReference = (JavaTypeBuiltInReference) vectorReference.getInternalReference();
                    if ("int".equals(intReference.getJavaName())) {
                        responseParser = responseParser.replace("{body}", JavaTemplate.JAVA_METHOD_PARSER_METHOD_BODY_INT_VECTOR);
                    } else if ("long".equals(intReference.getJavaName())) {
                        responseParser = responseParser.replace("{body}", JavaTemplate.JAVA_METHOD_PARSER_METHOD_BODY_LONG_VECTOR);
                    } else {
                        throw new Exception("Unsupported vector internal reference");
                    }
                } else if (vectorReference.getInternalReference() instanceof JavaTypeTlReference) {
                    JavaTypeTlReference tlReference = (JavaTypeTlReference) vectorReference.getInternalReference();
                    responseParser = responseParser.replace("{body}", JavaTemplate.JAVA_METHOD_PARSER_METHOD_BODY_VECTOR.replace("{vector_type}", tlReference.getJavaName()));
                } else {
                    throw new Exception("Unsupported built-in reference");
                }
            } else if (m.returnReference instanceof JavaTypeTlReference) {
                JavaTypeTlReference returnReference = (JavaTypeTlReference) m.getReturnReference();
                responseParser = responseParser.replace("{body}", JavaTemplate.JAVA_METHOD_PARSER_METHOD_BODY_GENERAL.replace("{return_type}", returnReference.getJavaName()));
            } else if (m.returnReference instanceof JavaTypeBuiltInReference) {
                JavaTypeBuiltInReference returnReference = (JavaTypeBuiltInReference) m.getReturnReference();
                if (!"boolean".equals(returnReference.getJavaName())) {
                    throw new Exception("Only boolean built-in reference allowed as return");
                }
                responseParser = responseParser.replace("{body}", JavaTemplate.JAVA_METHOD_PARSER_METHOD_BODY_GENERAL.replace("{return_type}", JavaConfigConstant.JAVA_CORE_PACKAGE + ".TLBool"));
            } else {
                JavaParameter functionalParameter = null;
                for (final JavaParameter p : m.getParameters()) {
                    if (p.reference instanceof JavaTypeFunctionalReference) {
                        functionalParameter = p;
                        break;
                    }
                }

                if (functionalParameter == null) {
                    throw new Exception("Any reference without functional reference: " + m.getMethodName());
                }

                responseParser = responseParser.replace(
                        "{body}",
                        JavaTemplate.JAVA_METHOD_PARSER_METHOD_BODY_REFERENCE.replace("{return_type}", "TLObject")
                        .replace("{int}", functionalParameter.getInternalName())
                );
            }

            generatedFile = generatedFile.replace("{responseParser}", responseParser);

            directory = path + (JavaConfigConstant.JAVA_PACKAGE + "." + JavaConfigConstant.JAVA_METHOD_PACKAGE).replace(".", "/");
            new File(directory).mkdirs();
            Files.write(
                    Paths.get(new File(directory + "/" + m.getRequestClassName() + ".java").toURI()),
                    generatedFile.getBytes(Charset.forName("utf-8")),
                    StandardOpenOption.CREATE
            );
        }

        String requests = "";
        for (final JavaRpcMethod m : model.getMethods()) {

            String args = "";
            String methodArgs = "";
            for (final JavaParameter p : m.getParameters()) {
                if (!"".equals(args)) {
                    args += ", ";
                }
                if (!"".equals(methodArgs)) {
                    methodArgs += ", ";
                }
                methodArgs += p.getInternalName();
                args += p.getReference().getJavaName() + " " + p.getInternalName();
            }

            String returnTypeName = m.getReturnReference().getJavaName();
            if ("boolean".equals(returnTypeName)) {
                returnTypeName = "TLBool";
            }

            requests += JavaTemplate.JAVA_REQUESTER_METHOD.replace("{return_type}", returnTypeName)
                    .replace("{method_name}", m.getMethodName())
                    .replace("{method_class}", m.getRequestClassName())
                    .replace("{args}", args)
                    .replace("{method_args}", methodArgs);
        }

        generatedFile = JavaTemplate.JAVA_REQUSTER_TEMPLATE.replace("{methods}", requests).replace("{package}", JavaConfigConstant.JAVA_PACKAGE);

        directory = path + JavaConfigConstant.JAVA_PACKAGE.replace(".", "/");
        new File(directory).mkdirs();
        Files.write(
                Paths.get(new File(directory + "/TLApiRequester.java").toURI()),
                generatedFile.getBytes(Charset.forName("utf-8")),
                StandardOpenOption.CREATE
        );

        String contextInit = "";
        for (final JavaTypeObject t : model.getTypes().values()) {

            if (t.getConstructors().size() == 1 && !TLConstant.IGNORED_TYPES.contains(t.getTlType().getName())) {
                contextInit += JavaTemplate.JAVA_CONTEXT_INT_RECORD
                        .replace("{type}", t.getJavaPackage() + "." + t.getJavaTypeName())
                        .replace("{id}", "0x" + Integer.toHexString(t.getConstructors().get(0).getTlConstructor().getId()));
            } else {
                for (final JavaTypeConstructor c : t.getConstructors()) {
                    contextInit += JavaTemplate.JAVA_CONTEXT_INT_RECORD
                            .replace("{type}", t.getJavaPackage() + "." + c.getJavaClassName())
                            .replace("{id}", "0x" + Integer.toHexString(c.getTlConstructor().getId()));
                }
            }
        }

        generatedFile = JavaTemplate.JAVA_CONTEXT_TEMPLATE.replace("{init}", contextInit).replace("{package}", JavaConfigConstant.JAVA_PACKAGE);

        directory = path + JavaConfigConstant.JAVA_PACKAGE.replace(".", "/");
        new File(directory).mkdirs();
        Files.write(
                Paths.get(new File(directory + "/TLApiContext.java").toURI()),
                generatedFile.getBytes(Charset.forName("utf-8")),
                StandardOpenOption.CREATE
        );
    }
}
