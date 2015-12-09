package com.payway.telegram.api.mtproto.tl.core;

import com.payway.telegram.api.tl.core.TLContext;
import com.payway.telegram.api.tl.core.TLObject;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readBytes;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readLong;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeByteArray;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeLong;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * MTRpcResult
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class MTRpcResult extends TLObject {

    public static final int CLASS_ID = 0xf35c6d01;

    protected long msgId;
    protected byte[] content;
    protected int contentLen;

    public MTRpcResult(final long msgId, final byte[] content, final int contentLen) {
        this.msgId = msgId;
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
        writeByteArray(content, 0, contentLen, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        
        msgId = readLong(stream);        
        final int contentSize = stream.available();
        //TODO:
        //content = BytesCache.getInstance().allocate(contentSize);
        readBytes(content, 0, contentSize, stream);
    }
}
