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

    public final static String JAVA_CORE_PACKAGE = "org.telegram.tl";
    public final static String JAVA_PACKAGE = "org.telegram.api";
    public final static String JAVA_METHOD_PACKAGE = "requests";
    public final static String JAVA_CLASS_PREFIX = "TL";
    public final static String JAVA_ABSTRACT_CLASS_PREFIX = "Abs";
    public final static String JAVA_METHOD_CLASS_PREFIX = "Request";

    static {
        IGNORE_UNITING = new ArrayList<>();
        IGNORE_UNITING.add("DecryptedMessageAction");
    }

    public static String mapJavaMethodName(TLMethodDef methodDef) {
        return methodDef.getName();
    }

    public static String mapJavaMethodClassName(TLMethodDef methodDef) {
        return JAVA_CLASS_PREFIX + JAVA_METHOD_CLASS_PREFIX + methodDef.getName();
    }

    public static String mapJavaPackage(TLCombinedTypeDef typedef) {
        final String pkg = typedef.getName();
        if (pkg.isEmpty()) {
            return JAVA_PACKAGE;
        } else {
            return JAVA_PACKAGE + "." + pkg;
        }
    }

    public static String mapJavaTypeName(TLCombinedTypeDef typedef) {
        if (typedef.getConstructors().size() == 1) {
            return JAVA_CLASS_PREFIX + typedef.getName();
        } else {
            return JAVA_CLASS_PREFIX + JAVA_ABSTRACT_CLASS_PREFIX + typedef.getName();
        }
    }

    public static String mapJavaChildName(TLConstructorDef constructor) {
        return JAVA_CLASS_PREFIX + constructor.getName();
    }

    public static String mapVariableBaseName(TLParameterDef parameter) {
        if (parameter.getName().equals("long")) {
            return "lon";
        } else {
            return parameter.getName();
        }
    }
}
