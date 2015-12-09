package com.payway.telegram.api.mtproto.tl.core.context;

import com.payway.telegram.api.mtproto.tl.core.MTBadMessageNotification;
import com.payway.telegram.api.mtproto.tl.core.MTBadServerSalt;
import com.payway.telegram.api.mtproto.tl.core.MTFutureSalt;
import com.payway.telegram.api.mtproto.tl.core.MTFutureSalts;
import com.payway.telegram.api.mtproto.tl.core.MTGetFutureSalts;
import com.payway.telegram.api.mtproto.tl.core.MTMessageDetailedInfo;
import com.payway.telegram.api.mtproto.tl.core.MTMessagesContainer;
import com.payway.telegram.api.mtproto.tl.core.MTMsgsAck;
import com.payway.telegram.api.mtproto.tl.core.MTNeedResendMessage;
import com.payway.telegram.api.mtproto.tl.core.MTNewMessageDetailedInfo;
import com.payway.telegram.api.mtproto.tl.core.MTNewSessionCreated;
import com.payway.telegram.api.mtproto.tl.core.MTPing;
import com.payway.telegram.api.mtproto.tl.core.MTPingDelayDisconnect;
import com.payway.telegram.api.mtproto.tl.core.MTPong;
import com.payway.telegram.api.mtproto.tl.core.MTRpcError;
import com.payway.telegram.api.mtproto.tl.core.MTRpcResult;
import com.payway.telegram.api.tl.core.TLContext;

/**
 * TLMTCoreContext
 *
 * @author
 * @created 09.12.2015
 */
public class TLMTCoreContext extends TLContext {

    private static class ContextHolder {

        public static final TLMTCoreContext HOLDER_INSTANCE = new TLMTCoreContext();
    }

    public static TLMTCoreContext getInstance() {
        return ContextHolder.HOLDER_INSTANCE;
    }

    @Override
    protected void init() {
        registerClass(MTPing.CLASS_ID, MTPing.class);
        registerClass(MTPingDelayDisconnect.CLASS_ID, MTPingDelayDisconnect.class);
        registerClass(MTPong.CLASS_ID, MTPong.class);
        registerClass(MTMsgsAck.CLASS_ID, MTMsgsAck.class);
        registerClass(MTNewSessionCreated.CLASS_ID, MTNewSessionCreated.class);
        registerClass(MTBadMessageNotification.CLASS_ID, MTBadMessageNotification.class);
        registerClass(MTBadServerSalt.CLASS_ID, MTBadServerSalt.class);
        registerClass(MTNewMessageDetailedInfo.CLASS_ID, MTNewMessageDetailedInfo.class);
        registerClass(MTMessageDetailedInfo.CLASS_ID, MTMessageDetailedInfo.class);
        registerClass(MTNeedResendMessage.CLASS_ID, MTNeedResendMessage.class);
        registerClass(MTMessagesContainer.CLASS_ID, MTMessagesContainer.class);
        registerClass(MTRpcError.CLASS_ID, MTRpcError.class);
        registerClass(MTRpcResult.CLASS_ID, MTRpcResult.class);
        registerClass(MTGetFutureSalts.CLASS_ID, MTGetFutureSalts.class);
        registerClass(MTFutureSalt.CLASS_ID, MTFutureSalt.class);
        registerClass(MTFutureSalts.CLASS_ID, MTFutureSalts.class);
    }
}
