/*
 * (c) Payway, 2015. All right reserved.
 */
package com.payway.telegram.api.tl.schema.generator;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * TLGeneratorSyntax
 *
 * @author Sergey Kichenko
 * @created 07.12.2015
 */
public final class TLGeneratorSyntax {

    public static abstract class TLType {
        //
    }

    public static class TLTypeRaw extends TLType {

        private final String name;

        public TLTypeRaw(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class TLTypeGeneric extends TLType {

        private final String name;
        private final List<TLType> generics;

        public TLTypeGeneric(String name, List<TLType> generics) {
            this.name = name;
            this.generics = generics;
        }

        public String getName() {
            return name;
        }

        public List<TLType> getGenerics() {
            return generics;
        }
    }

    public static class TLTypeAny extends TLType {
        //
    }

    public static class TLTypeFunctional extends TLType {

        private final String name;

        public TLTypeFunctional(String name) {
            this.name = name;
        }
    }

    public static class TLDefinition {

        private final List<TLConstructor> contructors;
        private final List<TLMethod> methods;

        public TLDefinition(List<TLConstructor> contructors, List<TLMethod> methods) {
            this.contructors = contructors;
            this.methods = methods;
        }

        public List<TLConstructor> getContructors() {
            return contructors;
        }

        public List<TLMethod> getMethods() {
            return methods;
        }
    }

    public static class TLParameter {

        private final String name;
        private final TLType tlType;

        public TLParameter(String name, TLType tlType) {
            this.name = name;
            this.tlType = tlType;
        }

        public String getName() {
            return name;
        }

        public TLType getTlType() {
            return tlType;
        }
    }

    public static class TLConstructor {

        private final Integer id;
        private final String name;
        private final TLType tlType;
        private final List<TLParameter> parameters;

        public TLConstructor(Integer id, String name, TLType tlType, List<TLParameter> parameters) {
            this.id = id;
            this.name = name;
            this.tlType = tlType;
            this.parameters = parameters;
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public TLType getTlType() {
            return tlType;
        }

        public List<TLParameter> getParameters() {
            return parameters;
        }
    }

    public static class TLMethod {

        private final Integer id;
        private final String name;
        private final TLType tlType;
        private final List<TLParameter> parameters;

        public TLMethod(Integer id, String name, TLType tlType, List<TLParameter> parameters) {
            this.id = id;
            this.name = name;
            this.tlType = tlType;
            this.parameters = parameters;
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public TLType getTlType() {
            return tlType;
        }

        public List<TLParameter> getParameters() {
            return parameters;
        }
    }

    public static TLType createTypeFromName(String name) {

        if (name.equals("X")) {
            return new TLTypeAny();
        } else if (name.equals("!X")) {
            return new TLTypeFunctional("X");
        } else if (name.contains("<") && name.contains(">")) {

            final List<TLType> generics = new ArrayList<>();
            String tlName = name.substring(0, name.indexOf("<"));
            String genericName = name.substring(name.indexOf("<") + 1);

            genericName = genericName.substring(0, genericName.indexOf(">"));
            generics.add(createTypeFromName(genericName));

            return new TLTypeGeneric(tlName, generics);
        } else {
            return new TLTypeRaw(name);
        }
    }

    public static TLDefinition buildFromJson(final JsonNode root) {

        final List<TLConstructor> sourceConstructors = new ArrayList<>();
        final List<TLMethod> sourceMethods = new ArrayList<>();

        for (final JsonNode ctr : root.get("constructors")) {

            final String name = ctr.get("predicate").textValue();
            final int id = Integer.parseInt(ctr.get("id").textValue());
            final String rawType = ctr.get("type").textValue();

            if (TLConstant.IGNORED_TYPES.contains(rawType)) {
                continue;
            }

            final TLType tlType = createTypeFromName(rawType);
            final List<TLParameter> constructorParameters = new ArrayList<>();

            for (final JsonNode param : ctr.get("params")) {
                final String paramName = param.get("name").textValue();
                final String paramType = param.get("type").textValue();
                constructorParameters.add(new TLParameter(paramName, createTypeFromName(paramType)));
            }

            sourceConstructors.add(new TLConstructor(id, name, tlType, constructorParameters));
        }

        for (final JsonNode method : root.get("methods")) {

            final String name = method.get("method").textValue();
            final int id = Integer.parseInt(method.get("id").textValue());
            final String rawType = method.get("type").textValue();
            final TLType tlType = createTypeFromName(rawType);

            final List<TLParameter> constructorParameters = new ArrayList<>();
            final JsonNode paramsNode = method.get("params");
            for (final JsonNode param : paramsNode) {

                final String paramName = param.get("name").textValue();
                final String paramType = param.get("type").textValue();
                constructorParameters.add(new TLParameter(paramName, createTypeFromName(paramType)));
            }

            sourceMethods.add(new TLMethod(id, name, tlType, constructorParameters));
        }

        return new TLDefinition(sourceConstructors, sourceMethods);
    }

    public static void checkDefinition(TLDefinition definition) throws Exception {

        for (final TLConstructor ctr : definition.getContructors()) {
            if (ctr.getTlType() instanceof TLTypeGeneric) {
                throw new Exception("Generic types are not supported as custom types");
            }

            checkType(ctr.getTlType());
            for (final TLParameter param : ctr.getParameters()) {
                checkType(param.getTlType());
            }
        }

        final Set<String> availableTypes = new HashSet<>();
        for (final String builtIn : TLConstant.BUILD_IN_TYPES) {
            availableTypes.add(builtIn);
        }

        for (final TLConstructor ctr : definition.getContructors()) {
            if (ctr.getTlType() instanceof TLTypeRaw) {
                availableTypes.add(((TLTypeRaw) ctr.getTlType()).getName());
            }
        }

        for (final TLConstructor ctr : definition.getContructors()) {
            for (final TLParameter param : ctr.getParameters()) {
                checkType(param.getTlType());
            }
        }

        for (final TLMethod method : definition.getMethods()) {
            for (final TLParameter param : method.getParameters()) {
                checkType(param.getTlType());
            }
            checkType(method.getTlType());
        }
    }

    public static void checkType(TLType param) throws Exception {
        if (param instanceof TLTypeGeneric) {
            if (!((TLTypeGeneric) param).getName().equals("Vector")) {
                throw new Exception("Only vector generics supported");
            }
        }
    }
}
