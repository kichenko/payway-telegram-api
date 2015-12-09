package com.payway.telegram.api.mtproto.tl.authentication;

import com.payway.telegram.api.tl.core.TLContext;
import com.payway.telegram.api.tl.core.TLObject;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readBytes;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readLong;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readTLBytes;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeByteArray;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeLong;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeTLBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * ClientDhInner
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class ClientDhInner extends TLObject {

    public static final int CLASS_ID = 0x6643b654;

    protected byte[] nonce;
    protected byte[] serverNonce;
    protected long retryId;
    protected byte[] gb;

    public ClientDhInner(final byte[] nonce, final byte[] serverNonce, final long retryId, final byte[] gb) {
        this.nonce = nonce;
        this.serverNonce = serverNonce;
        this.retryId = retryId;
        this.gb = gb;
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeByteArray(nonce, stream);
        writeByteArray(serverNonce, stream);
        writeLong(retryId, stream);
        writeTLBytes(gb, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        nonce = readBytes(16, stream);
        serverNonce = readBytes(16, stream);
        retryId = readLong(stream);
        gb = readTLBytes(stream);
    }
}
