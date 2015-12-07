package com.payway.telegram.api.tl.core;

/**
 * Packed type of tl-bool true value
 *
 * @author
 * @created 07.12.2015
 */
public class TLBoolTrue extends TLBool {

    private static final long serialVersionUID = -4810770111778775542L;

    public static final int CLASS_ID = 0x997275b5;

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public String toString() {
        return "boolTrue#997275b5";
    }
}
