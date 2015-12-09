package com.payway.telegram.api.mtproto.tl.authentication.context;

import com.payway.telegram.api.mtproto.tl.authentication.ClientDhInner;
import com.payway.telegram.api.mtproto.tl.authentication.DhGenFailure;
import com.payway.telegram.api.mtproto.tl.authentication.DhGenOk;
import com.payway.telegram.api.mtproto.tl.authentication.DhGenRetry;
import com.payway.telegram.api.mtproto.tl.authentication.ReqDhParams;
import com.payway.telegram.api.mtproto.tl.authentication.ReqPQ;
import com.payway.telegram.api.mtproto.tl.authentication.ReqSetDhClientParams;
import com.payway.telegram.api.mtproto.tl.authentication.ResPQ;
import com.payway.telegram.api.mtproto.tl.authentication.ServerDhFailure;
import com.payway.telegram.api.mtproto.tl.authentication.ServerDhInner;
import com.payway.telegram.api.mtproto.tl.authentication.ServerDhOk;
import com.payway.telegram.api.tl.core.TLContext;

/**
 * TLMTAuthContext
 *
 * @author
 * @created 09.12.2015
 */
public class TLMTAuthContext extends TLContext {

    @Override
    protected void init() {
        registerClass(ReqPQ.CLASS_ID, ReqPQ.class);
        registerClass(ResPQ.CLASS_ID, ResPQ.class);
        registerClass(ReqDhParams.CLASS_ID, ReqDhParams.class);
        registerClass(ServerDhOk.CLASS_ID, ServerDhOk.class);
        registerClass(ServerDhFailure.CLASS_ID, ServerDhFailure.class);
        registerClass(ServerDhInner.CLASS_ID, ServerDhInner.class);
        registerClass(DhGenOk.CLASS_ID, DhGenOk.class);
        registerClass(DhGenFailure.CLASS_ID, DhGenFailure.class);
        registerClass(DhGenRetry.CLASS_ID, DhGenRetry.class);
        registerClass(ReqSetDhClientParams.CLASS_ID, ReqSetDhClientParams.class);
        registerClass(ClientDhInner.CLASS_ID, ClientDhInner.class);
    }
}
