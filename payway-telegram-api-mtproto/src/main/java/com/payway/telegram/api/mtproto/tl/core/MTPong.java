package com.payway.telegram.api.mtproto.tl.core;

import com.payway.telegram.api.tl.core.TLContext;
import com.payway.telegram.api.tl.core.TLObject;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readLong;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeLong;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * MTPong
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class MTPong extends TLObject {

    public static final int CLASS_ID = 0x347773c5;

    protected long msgId;
    protected long pingId;

    public MTPong(final long msgId, final long pingId) {
        this.msgId = msgId;
        this.pingId = pingId;
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeLong(msgId, stream);
        writeLong(pingId, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        msgId = readLong(stream);
        pingId = readLong(stream);
    }
}
