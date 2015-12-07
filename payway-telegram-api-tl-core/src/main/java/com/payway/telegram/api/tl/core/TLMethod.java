package com.payway.telegram.api.tl.core;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Basic object for RPC methods. It contains special methods for deserializing
 * result of RPC method call.
 *
 * @param <T> return type of method
 *
 * @author
 * @created 07.12.2015
 */
public abstract class TLMethod<T extends TLObject> extends TLObject {

    private static final long serialVersionUID = -8101752769094149884L;

    public T deserializeResponse(byte[] data, TLContext context) throws IOException {
        return deserializeResponse(new ByteArrayInputStream(data), context);
    }

    public abstract T deserializeResponse(InputStream stream, TLContext context) throws IOException;
}
