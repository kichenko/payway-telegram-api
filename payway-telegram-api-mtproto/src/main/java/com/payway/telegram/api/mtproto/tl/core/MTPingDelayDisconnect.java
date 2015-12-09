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
 * MTPingDelayDisconnect
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class MTPingDelayDisconnect extends TLObject {

    public static final int CLASS_ID = 0xf3427b8c;

    protected long pingId;
    protected int disconnectDelay;

    public MTPingDelayDisconnect(final long pingId, final int disconnectDelay) {
        this.pingId = pingId;
        this.disconnectDelay = disconnectDelay;
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeLong(pingId, stream);
        writeInt(disconnectDelay, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        pingId = readLong(stream);
        disconnectDelay = readInt(stream);
    }
}
