/*
 * (c) Payway, 2015. All right reserved.
 */
package com.payway.telegram.api.tl.schema.generator;

import com.payway.telegram.api.tl.schema.generator.TLGeneratorModel.TLAnonymousTypeDef;
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
import static com.payway.telegram.api.tl.schema.generator.TLGeneratorModel.buildParameterDef;
import static com.payway.telegram.api.tl.schema.generator.TLGeneratorModel.getTypeReference;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorSyntax.TLConstructor;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorSyntax.TLDefinition;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorSyntax.TLMethod;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorSyntax.TLParameter;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorSyntax.TLType;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorSyntax.TLTypeAny;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorSyntax.TLTypeFunctional;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorSyntax.TLTypeGeneric;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorSyntax.TLTypeRaw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TLGeneratorModel
 *
 * @author Sergey Kichenko
 * @created 07.12.2015
 */
public final class TLGeneratorModel {

    public static class TLModel {

        private final List<TLTypeDef> types;
        private final List<TLMethodDef> methods;

        public TLModel(List<TLTypeDef> types, List<TLMethodDef> methods) {
            this.types = types;
            this.methods = methods;
        }

        public List<TLTypeDef> getTypes() {
            return types;
        }

        public List<TLMethodDef> getMethods() {
            return methods;
        }

    }

    public static class TLParameterDef {

        private final String name;
        private final TLTypeDef typeDef;

        public TLParameterDef(String name, TLTypeDef typeDef) {
            this.name = name;
            this.typeDef = typeDef;
        }

        public String getName() {
            return name;
        }

        public TLTypeDef getTypeDef() {
            return typeDef;
        }

    }

    public static class TLConstructorDef {

        private final int id;
        private final String name;
        private final List<TLParameterDef> parameters;

        public TLConstructorDef(int id, String name, List<TLParameterDef> parameters) {
            this.id = id;
            this.name = name;
            this.parameters = parameters;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public List<TLParameterDef> getParameters() {
            return parameters;
        }
    }

    public static abstract class TLTypeDef {

        protected String name;

        public TLTypeDef(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class TLCombinedTypeDef extends TLTypeDef {

        private final List<TLConstructorDef> constructors;

        public TLCombinedTypeDef(String name, List<TLConstructorDef> constructors) {
            super(name);
            this.constructors = constructors;
        }

        public List<TLConstructorDef> getConstructors() {
            return constructors;
        }

        @Override
        public String toString() {
            return name;
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof TLCombinedTypeDef ? name.equals(((TLCombinedTypeDef) obj).getName()) : false;
        }
    }

    public static class TLAnonymousTypeDef extends TLTypeDef {

        private final TLConstructor constructor;

        public TLAnonymousTypeDef(TLConstructor constructor) {
            super(constructor.getName());
            this.constructor = constructor;
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof TLAnonymousTypeDef ? name.equals(((TLAnonymousTypeDef) obj).getName()) : false;
        }
    }

    public static class TLAnyTypeDef extends TLTypeDef {

        public TLAnyTypeDef() {
            super("");
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof TLAnyTypeDef;
        }
    }

    public static class TLFunctionalTypeDef extends TLTypeDef {

        public TLFunctionalTypeDef() {
            super("");
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof TLFunctionalTypeDef;
        }
    }

    public static class TLBuiltInGenericTypeDef extends TLTypeDef {

        private final TLTypeDef basic;

        public TLBuiltInGenericTypeDef(String name, TLTypeDef basic) {
            super(name);
            this.basic = basic;
        }

        public TLTypeDef getBasic() {
            return basic;
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof TLBuiltInGenericTypeDef
                    ? getName().equals(((TLBuiltInGenericTypeDef) obj).getName())
                    && getBasic().getName().equals(((TLBuiltInGenericTypeDef) obj).getBasic().getName())
                    : false;
        }
    }

    public static class TLBuiltInTypeDef extends TLTypeDef {

        public TLBuiltInTypeDef(String name) {
            super(name);
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof TLBuiltInTypeDef
                    ? getName().equals(((TLBuiltInTypeDef) obj).getName())
                    : false;
        }
    }

    public static class TLMethodDef {

        private final int id;
        private final String name;
        private final List<TLParameterDef> args;
        private final TLTypeDef returnType;

        public TLMethodDef(int id, String name, List<TLParameterDef> args, TLTypeDef returnType) {
            this.id = id;
            this.name = name;
            this.args = args;
            this.returnType = returnType;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public List<TLParameterDef> getArgs() {
            return args;
        }

        public TLTypeDef getReturnType() {
            return returnType;
        }

    }

    public static TLParameterDef buildParameterDef(TLParameter sourceType, Map<String, TLTypeDef> types) throws Exception {
        return new TLParameterDef(sourceType.getName(), getTypeReference(sourceType.getTlType(), types));
    }

    public static TLTypeDef getTypeReference(TLType sourceType, Map<String, TLTypeDef> types) throws Exception {
        if (sourceType instanceof TLTypeRaw) {
            final TLTypeRaw rawType = (TLTypeRaw) sourceType;

            if (TLConstant.BUILD_IN_TYPES.contains(rawType.getName())) {
                return new TLBuiltInTypeDef(rawType.getName());
            } else {
                return types.get(rawType.getName());
            }
        } else if (sourceType instanceof TLTypeAny) {
            return new TLAnyTypeDef();
        } else if (sourceType instanceof TLTypeGeneric) {
            final TLTypeGeneric generic = (TLTypeGeneric) sourceType;
            return new TLBuiltInGenericTypeDef(generic.getName(), getTypeReference(generic.getGenerics().get(0), types));
        } else if (sourceType instanceof TLTypeFunctional) {
            return new TLFunctionalTypeDef();
        } else {
            throw new Exception("Unknown type");
        }
    }

    public static TLModel buildModel(TLDefinition definition) throws Exception {

        final Map<String, TLTypeDef> typeMap = new HashMap<>();
        for (TLConstructor ctr : definition.getContructors()) {
            if (ctr.getTlType() instanceof TLTypeGeneric) {
                throw new Exception("Generics are not supported as custom types");
            } else if (ctr.getTlType() instanceof TLTypeRaw) {

                if (TLConstant.BUILD_IN_TYPES.contains(((TLTypeRaw) ctr.getTlType()).getName())) {
                    throw new Exception("Founed " + ctr.toString() + " for built-in type");
                } else {
                    final TLTypeRaw rawType = (TLTypeRaw) ctr.getTlType();
                    if (!typeMap.containsKey(rawType.getName())) {
                        typeMap.put(rawType.getName(), new TLCombinedTypeDef(rawType.getName(), new ArrayList<TLConstructorDef>()));
                    }
                }
            } else if (ctr.getTlType() instanceof TLTypeAny) {
                // When we create constructor without particular type
                typeMap.put(ctr.getName(), new TLAnonymousTypeDef(ctr));
            } else {
                throw new Exception("Functional arguments in constructors are not supported");
            }
        }

        // Fill all constructors
        for (TLConstructor ctr : definition.getContructors()) {
            if (ctr.getTlType() instanceof TLTypeRaw) {
                final TLTypeRaw rawType = (TLTypeRaw) ctr.getTlType();
                final TLCombinedTypeDef typedef = (TLCombinedTypeDef) typeMap.get(rawType.getName());

                final List<TLParameterDef> paramDefs = new ArrayList<>();
                for (final TLParameter param : ctr.getParameters()) {
                    paramDefs.add(buildParameterDef(param, typeMap));
                }
                final TLConstructorDef constrDef = new TLConstructorDef(ctr.getId(), ctr.getName(), paramDefs);
                typedef.getConstructors().add(constrDef);
            }
        }

        final List<TLMethodDef> methods = new ArrayList<>();
        for (final TLMethod method : definition.getMethods()) {

            final TLTypeDef returnType = getTypeReference(method.getTlType(), typeMap);

            final List<TLParameterDef> paramDefs = new ArrayList<>();
            for (final TLParameter param : method.getParameters()) {
                paramDefs.add(buildParameterDef(param, typeMap));
            }

            methods.add(new TLMethodDef(method.getId(), method.getName(), paramDefs, returnType));

        }

        return new TLModel(new ArrayList<>(typeMap.values()), methods);
    }

}
