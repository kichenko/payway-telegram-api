package com.payway.telegram.api.tl.core;

/**
 * Packed type of tl-bool false value
 *
 * @author
 * @created 07.12.2015
 */
public class TLBoolFalse extends TLBool {

    private static final long serialVersionUID = 5492926675562537607L;

    public static final int CLASS_ID = 0xbc799737;

    @Override
    public int getClassId() {
        return CLASS_ID;
    }
}
