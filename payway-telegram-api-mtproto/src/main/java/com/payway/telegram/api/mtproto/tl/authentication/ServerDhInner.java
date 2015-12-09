package com.payway.telegram.api.mtproto.tl.authentication;

import com.payway.telegram.api.tl.core.TLContext;
import com.payway.telegram.api.tl.core.TLObject;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readBytes;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readInt;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readTLBytes;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeByteArray;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeInt;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeTLBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * ServerDhInner
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class ServerDhInner extends TLObject {

    public static final int CLASS_ID = 0xb5890dba;

    protected byte[] nonce;
    protected byte[] serverNonce;
    protected int g;
    protected byte[] dhPrime;
    protected byte[] ga;
    protected int serverTime;

    public ServerDhInner(
            final byte[] nonce,
            final byte[] serverNonce,
            final int g,
            final byte[] dhPrime,
            final byte[] ga,
            final int serverTime
    ) {
        this.nonce = nonce;
        this.serverNonce = serverNonce;
        this.g = g;
        this.dhPrime = dhPrime;
        this.ga = ga;
        this.serverTime = serverTime;
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeByteArray(nonce, stream);
        writeByteArray(serverNonce, stream);
        writeInt(g, stream);
        writeTLBytes(dhPrime, stream);
        writeTLBytes(ga, stream);
        writeInt(serverTime, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        nonce = readBytes(16, stream);
        serverNonce = readBytes(16, stream);
        g = readInt(stream);
        dhPrime = readTLBytes(stream);
        ga = readTLBytes(stream);
        serverTime = readInt(stream);
    }
}
