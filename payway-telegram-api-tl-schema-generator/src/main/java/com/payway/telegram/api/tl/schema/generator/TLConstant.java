/*
 * (c) Payway, 2015. All right reserved.
 */
package com.payway.telegram.api.tl.schema.generator;

import java.util.ArrayList;
import java.util.List;

/**
 * TLConstant
 *
 * @author Sergey Kichenko
 * @created 07.12.2015
 */
public final class TLConstant {

    public final static List<String> BUILD_IN_TYPES = new ArrayList<>();
    public final static List<String> IGNORED_TYPES = new ArrayList<>();

    static {

        BUILD_IN_TYPES.add("Bool");
        BUILD_IN_TYPES.add("Vector");
        BUILD_IN_TYPES.add("int");
        BUILD_IN_TYPES.add("long");
        BUILD_IN_TYPES.add("double");
        BUILD_IN_TYPES.add("string");
        BUILD_IN_TYPES.add("bytes");

        IGNORED_TYPES.add("Bool");
        IGNORED_TYPES.add("Null");
        IGNORED_TYPES.add("Error");
        IGNORED_TYPES.add("Vector t");
    }

}
