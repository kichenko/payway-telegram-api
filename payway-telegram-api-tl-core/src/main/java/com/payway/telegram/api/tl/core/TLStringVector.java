package com.payway.telegram.api.tl.core;

/**
 * TL Vector of strings. @see org.telegram.tl.TLVector
 *
 * @author
 * @created 07.12.2015
 */
public class TLStringVector extends TLVector<String> {

    private static final long serialVersionUID = 8663553390798417104L;

    public TLStringVector() {
        setDestClass(String.class);
    }
}
