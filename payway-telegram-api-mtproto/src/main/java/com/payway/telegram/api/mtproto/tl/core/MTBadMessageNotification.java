package com.payway.telegram.api.mtproto.tl.core;

import com.payway.telegram.api.tl.core.TLContext;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readInt;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readLong;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeInt;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeLong;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import lombok.NoArgsConstructor;

/**
 * MTBadMessageNotification
 *
 * @author
 * @created 09.12.2015
 */
@NoArgsConstructor
public class MTBadMessageNotification extends MTBadMessage {

    public static final int CLASS_ID = 0xa7eff811;

    public MTBadMessageNotification(final long badMsgId, final int badMsqSeqno, final int errorCode) {
        super(badMsgId, badMsqSeqno, errorCode);
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeLong(badMsgId, stream);
        writeInt(badMsqSeqno, stream);
        writeInt(errorCode, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        badMsgId = readLong(stream);
        badMsqSeqno = readInt(stream);
        errorCode = readInt(stream);
    }
}
