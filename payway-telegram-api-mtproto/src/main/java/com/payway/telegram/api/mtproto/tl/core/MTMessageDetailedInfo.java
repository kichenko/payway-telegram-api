package com.payway.telegram.api.mtproto.tl.core;

import com.payway.telegram.api.tl.core.TLContext;
import com.payway.telegram.api.tl.core.TLObject;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readInt;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readLong;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeInt;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeLong;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * MTMessage
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@Setter
@NoArgsConstructor
public class MTMessageDetailedInfo extends TLObject {

    public static final int CLASS_ID = 0x276d3ec6;

    protected long msgId;
    protected long answerMsgId;
    protected int bytes;
    protected int status;

    public MTMessageDetailedInfo(final long msgId, final long answerMsgId, final int bytes, final int status) {
        this.msgId = msgId;
        this.answerMsgId = answerMsgId;
        this.bytes = bytes;
        this.status = status;
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeLong(msgId, stream);
        writeLong(answerMsgId, stream);
        writeInt(bytes, stream);
        writeInt(status, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        msgId = readLong(stream);
        answerMsgId = readLong(stream);
        bytes = readInt(stream);
        status = readInt(stream);
    }
}
