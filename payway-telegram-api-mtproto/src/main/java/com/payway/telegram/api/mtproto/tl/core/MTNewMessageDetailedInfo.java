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

/**
 * MTNewMessageDetailedInfo
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class MTNewMessageDetailedInfo extends TLObject {

    public static final int CLASS_ID = 0x809db6df;

    protected long answerMsgId;
    protected int bytes;
    protected int status;

    public MTNewMessageDetailedInfo(final long answerMsgId, final int bytes, final int status) {
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
        writeLong(answerMsgId, stream);
        writeInt(bytes, stream);
        writeInt(status, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        answerMsgId = readLong(stream);
        bytes = readInt(stream);
        status = readInt(stream);
    }
}
