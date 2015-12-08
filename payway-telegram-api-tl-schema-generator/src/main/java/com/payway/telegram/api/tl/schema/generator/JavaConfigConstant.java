/*
 * (c) Payway, 2015. All right reserved.
 */
package com.payway.telegram.api.tl.schema.generator;

import com.payway.telegram.api.tl.schema.generator.TLGeneratorModel.TLCombinedTypeDef;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorModel.TLConstructorDef;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorModel.TLMethodDef;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorModel.TLParameterDef;
import java.util.ArrayList;
import java.util.List;

/**
 * JavaConfigConstant
 *
 * @author Sergey Kichenko
 * @created 07.12.2015
 */
public final class JavaConfigConstant {

    public final static List<String> IGNORE_UNITING;

    public final static String JAVA_CORE_PACKAGE = "com.payway.telegram.api.tl.core";
    public final static String JAVA_CORE_UTILS_PACKAGE = "com.payway.telegram.api.tl.core.utils";
    public final static String JAVA_PACKAGE = "com.payway.telegram.api.tl.schema";
    public final static String JAVA_METHOD_PACKAGE = "methods";
    public final static String JAVA_CLASS_PREFIX = "TL";
    public final static String JAVA_ABSTRACT_CLASS_PREFIX = "Abstract";
    public final static String JAVA_METHOD_CLASS_PREFIX = "Method";

    static {
        IGNORE_UNITING = new ArrayList<>();
        IGNORE_UNITING.add("DecryptedMessageAction");
        IGNORE_UNITING.add("Update");
    }

    private static String toProperCase(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    private static String camelCase(final String src, final String reqex) {

        if (!reqex.isEmpty()) {
            String camelCaseString = "";
            for (String part : src.split(reqex)) {
                camelCaseString = camelCaseString + toProperCase(part);
            }
            return camelCaseString;
        } else {
            return src;
        }
    }

    public static String lCamelCase(final String src, final String reqex) {
        String dst = camelCase(src, reqex);
        return dst.substring(0, 1).toLowerCase() + dst.substring(1);
    }

    public static String uCamelCase(final String src, final String reqex) {
        String dst = camelCase(src, reqex);
        return dst.substring(0, 1).toUpperCase() + dst.substring(1);
    }

    public static String skipNamespace(final String src) {
        int idx = src.lastIndexOf(".");
        return idx >= 0 ? src.substring(idx + 1) : src;
    }

    public static String getNamespace(final String src) {
        int idx = src.lastIndexOf(".");
        return idx >= 0 ? src.substring(0, idx) : "";
    }

    public static String mapJavaMethodName(TLMethodDef methodDef) {
        return uCamelCase(methodDef.getName(), "\\.");
    }

    public static String mapJavaMethodClassName(TLMethodDef methodDef) {
        return JAVA_CLASS_PREFIX + uCamelCase(methodDef.getName(), "\\.") + JAVA_METHOD_CLASS_PREFIX;
    }

    public static String mapJavaPackage(TLCombinedTypeDef typedef) {
        final String pkg = getNamespace(typedef.getName());
        if (pkg.isEmpty()) {
            return JAVA_PACKAGE;
        } else {
            return JAVA_PACKAGE + "." + pkg;
        }
    }

    public static String mapJavaTypeName(TLCombinedTypeDef typedef) {
        if (typedef.getConstructors().size() == 1) {
            return JAVA_CLASS_PREFIX + uCamelCase(skipNamespace(typedef.getName()), "_");
        } else {
            return JAVA_CLASS_PREFIX + JAVA_ABSTRACT_CLASS_PREFIX + uCamelCase(skipNamespace(typedef.getName()), "_");
        }
    }

    public static String mapJavaChildName(TLConstructorDef constructor) {
        return JAVA_CLASS_PREFIX + uCamelCase(skipNamespace(constructor.getName()), "_");
    }

    public static String mapVariableBaseName(TLParameterDef parameter) {
        if (parameter.getName().equals("long")) {
            return "lon";
        } else {
            return lCamelCase(parameter.getName(), "_");
        }
    }
}
