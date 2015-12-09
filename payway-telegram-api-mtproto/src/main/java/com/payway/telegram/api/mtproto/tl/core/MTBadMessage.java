package com.payway.telegram.api.mtproto.tl.core;

import com.payway.telegram.api.tl.core.TLObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * MTBadMessage
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class MTBadMessage extends TLObject {

    protected long badMsgId;
    protected int badMsqSeqno;
    protected int errorCode;
}
