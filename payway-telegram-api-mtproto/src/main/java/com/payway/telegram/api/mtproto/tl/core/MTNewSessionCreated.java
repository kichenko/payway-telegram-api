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
 * MTNewSessionCreated
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class MTNewSessionCreated extends TLObject {

    public static final int CLASS_ID = 0x9ec20908;

    protected long firstMsgId;
    protected byte[] uniqId;
    protected byte[] serverSalt;

    public MTNewSessionCreated(final long firstMsgId, final byte[] uniqId, final byte[] serverSalt) {
        this.firstMsgId = firstMsgId;
        this.uniqId = uniqId;
        this.serverSalt = serverSalt;
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeLong(firstMsgId, stream);
        writeByteArray(uniqId, stream);
        writeByteArray(serverSalt, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        firstMsgId = readLong(stream);
        uniqId = readBytes(8, stream);
        serverSalt = readBytes(8, stream);
    }
}
