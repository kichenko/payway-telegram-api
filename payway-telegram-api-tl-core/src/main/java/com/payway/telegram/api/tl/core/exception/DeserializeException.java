package com.payway.telegram.api.tl.core.exception;

import java.io.IOException;

/**
 * DeserializeException
 *
 * @author
 * @created 07.12.2015
 */
public class DeserializeException extends IOException {

    private static final long serialVersionUID = 4877300295067365966L;

    public DeserializeException() {
    }

    public DeserializeException(String s) {
        super(s);
    }

    public DeserializeException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public DeserializeException(Throwable throwable) {
        super(throwable);
    }
}
