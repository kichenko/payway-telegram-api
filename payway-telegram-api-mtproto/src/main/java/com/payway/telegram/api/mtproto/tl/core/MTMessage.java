package com.payway.telegram.api.mtproto.tl.core;

import com.payway.telegram.api.tl.core.TLContext;
import com.payway.telegram.api.tl.core.TLObject;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readBytes;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readInt;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readLong;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeByteArray;
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
public class MTMessage extends TLObject {

    public static final int CLASS_ID = 0;

    protected long msgId;
    protected int seqNo;
    protected byte[] content;
    protected int contentLen;

    public MTMessage(final long msgId, final int seqNo, final byte[] content) {
        this(msgId, seqNo, content, content.length);
    }

    public MTMessage(final long msgId, final int seqNo, final byte[] content, final int contentLen) {
        this.msgId = msgId;
        this.seqNo = seqNo;
        this.content = content;
        this.contentLen = contentLen;
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeLong(msgId, stream);
        writeInt(seqNo, stream);
        writeInt(content.length, stream);
        writeByteArray(content, 0, contentLen, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        
        msgId = readLong(stream);
        seqNo = readInt(stream);
        
        final int size = readInt(stream);
        //TODO:
        //content = BytesCache.getInstance().allocate(size);
        readBytes(content, 0, size, stream);
    }
}
