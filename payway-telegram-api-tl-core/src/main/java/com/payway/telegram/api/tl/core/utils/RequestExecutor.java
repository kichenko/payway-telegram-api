package com.payway.telegram.api.tl.core.utils;

import java.io.IOException;

/**
 * Basic class of rpc method index class
 *
 * @author
 * @created 07.12.2015
 */
@Deprecated
public abstract class RequestExecutor {

    public abstract byte[] doRpcCall(byte[] request) throws IOException;
}
