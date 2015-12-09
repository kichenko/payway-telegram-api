package com.payway.telegram.api.mtproto.tl.core;

import com.payway.telegram.api.tl.core.TLContext;
import com.payway.telegram.api.tl.core.TLLongVector;
import com.payway.telegram.api.tl.core.TLObject;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readTLLongVector;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeTLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * MTNeedResendMessage
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class MTNeedResendMessage extends TLObject {

    public static final int CLASS_ID = 0x7d861a08;

    protected TLLongVector messages = new TLLongVector();

    public MTNeedResendMessage(final TLLongVector messages) {
        this.messages = messages;
    }

    public MTNeedResendMessage(final long[] msgIds) {
        for (long id : msgIds) {
            this.messages.add(id);
        }
    }

    public MTNeedResendMessage(final Long[] msgIds) {
        Collections.addAll(this.messages, msgIds);
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeTLVector(messages, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        messages = readTLLongVector(stream, context);
    }
}
