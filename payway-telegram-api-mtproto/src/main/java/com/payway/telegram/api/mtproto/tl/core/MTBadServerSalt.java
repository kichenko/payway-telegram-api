package com.payway.telegram.api.mtproto.tl.core;

import com.payway.telegram.api.tl.core.TLContext;
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
 * MTBadServerSalt
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class MTBadServerSalt extends MTBadMessage {

    public static final int CLASS_ID = 0xedab447b;

    protected long newSalt;

    public MTBadServerSalt(final long badMsgId, final int badMsqSeqno, final int errorCode, final long newSalt) {
        super(badMsgId, badMsqSeqno, errorCode);
        this.newSalt = newSalt;
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
        writeLong(newSalt, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        badMsgId = readLong(stream);
        badMsqSeqno = readInt(stream);
        errorCode = readInt(stream);
        newSalt = readLong(stream);
    }
}
