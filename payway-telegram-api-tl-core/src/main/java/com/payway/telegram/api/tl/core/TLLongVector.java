package com.payway.telegram.api.tl.core;

/**
 * TL Vector of longs. @see org.telegram.tl.TLVector
 *
 * @author
 * @created 07.12.2015
 */
public class TLLongVector extends TLVector<Long> {

    private static final long serialVersionUID = 4682131773549186952L;

    public TLLongVector() {
        setDestClass(Long.class);
    }

    @Override
    public String toString() {
        return "vector<long>#" + Integer.toString(CLASS_ID);
    }
}
