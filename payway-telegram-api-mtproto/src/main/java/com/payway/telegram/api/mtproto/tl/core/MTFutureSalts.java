package com.payway.telegram.api.mtproto.tl.core;

import com.payway.telegram.api.tl.core.TLContext;
import com.payway.telegram.api.tl.core.TLObject;
import com.payway.telegram.api.tl.core.TLVector;
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
public class MTFutureSalts extends TLObject {

    public static final int CLASS_ID = 0xae500895;

    protected long reqMsgId;
    protected int now;
    protected TLVector<MTFutureSalt> salts = new TLVector<>();

    public MTFutureSalts(final long reqMsgId, final int now, final TLVector<MTFutureSalt> salts) {
        this.reqMsgId = reqMsgId;
        this.now = now;
        this.salts = salts;
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeLong(reqMsgId, stream);
        writeInt(now, stream);
        writeInt(salts.size(), stream);
        for (final MTFutureSalt salt : salts) {
            salt.serializeBody(stream);
        }
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {

        reqMsgId = readLong(stream);
        now = readInt(stream);

        final int count = readInt(stream);
        salts.clear();
        for (int i = 0; i < count; i++) {
            final MTFutureSalt salt = new MTFutureSalt();
            salt.deserializeBody(stream, context);
            salts.add(salt);
        }
    }
}
