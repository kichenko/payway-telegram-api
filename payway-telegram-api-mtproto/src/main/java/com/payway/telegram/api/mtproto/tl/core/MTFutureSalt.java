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
 * MTFutureSalt
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class MTFutureSalt extends TLObject {

    public static final int CLASS_ID = 0x0949d9dc;

    protected int validSince;
    protected int validUntil;
    protected long salt;

    public MTFutureSalt(final int validSince, final int validUntil, final long salt) {
        this.validSince = validSince;
        this.validUntil = validUntil;
        this.salt = salt;
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeInt(validSince, stream);
        writeInt(validUntil, stream);
        writeLong(salt, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        validSince = readInt(stream);
        validUntil = readInt(stream);
        salt = readLong(stream);
    }
}
