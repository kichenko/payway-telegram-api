package com.payway.telegram.api.mtproto.tl.authentication;

import com.payway.telegram.api.tl.core.TLContext;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readBytes;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readTLBytes;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeByteArray;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeTLBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * ServerDhOk
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class ServerDhOk extends ServerDhParams {

    public static final int CLASS_ID = 0xd0e8075c;

    protected byte[] nonce;
    protected byte[] serverNonce;
    protected byte[] encryptedAnswer;

    public ServerDhOk(final byte[] nonce, final byte[] serverNonce, final byte[] encryptedAnswer) {
        this.nonce = nonce;
        this.serverNonce = serverNonce;
        this.encryptedAnswer = encryptedAnswer;
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeByteArray(nonce, stream);
        writeByteArray(serverNonce, stream);
        writeTLBytes(encryptedAnswer, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        nonce = readBytes(16, stream);
        serverNonce = readBytes(16, stream);
        encryptedAnswer = readTLBytes(stream);
    }
}
