package com.payway.telegram.api.mtproto.tl.authentication;

import com.payway.telegram.api.tl.core.TLContext;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readBytes;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeByteArray;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * ServerDhFailure
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class ServerDhFailure extends ServerDhParams {

    public static final int CLASS_ID = 0x79cb045d;

    protected byte[] nonce;
    protected byte[] serverNonce;
    protected byte[] newNonceHash;

    public ServerDhFailure(final byte[] nonce, final byte[] serverNonce, final byte[] newNonceHash) {
        this.nonce = nonce;
        this.serverNonce = serverNonce;
        this.newNonceHash = newNonceHash;
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeByteArray(nonce, stream);
        writeByteArray(serverNonce, stream);
        writeByteArray(newNonceHash, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        nonce = readBytes(16, stream);
        serverNonce = readBytes(16, stream);
        newNonceHash = readBytes(16, stream);
    }
}
