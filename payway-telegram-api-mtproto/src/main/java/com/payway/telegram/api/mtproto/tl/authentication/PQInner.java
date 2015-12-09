package com.payway.telegram.api.mtproto.tl.authentication;

import com.payway.telegram.api.tl.core.TLContext;
import com.payway.telegram.api.tl.core.TLObject;
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
 * PQInner
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class PQInner extends TLObject {

    public static final int CLASS_ID = 0x83c95aec;

    protected byte[] pq;
    protected byte[] p;
    protected byte[] q;
    protected byte[] nonce;
    protected byte[] serverNonce;
    protected byte[] newNonce;

    public PQInner(
            final byte[] pq,
            final byte[] p,
            final byte[] q,
            final byte[] nonce,
            final byte[] serverNonce,
            final byte[] newNonce
    ) {
        this.pq = pq;
        this.p = p;
        this.q = q;
        this.nonce = nonce;
        this.serverNonce = serverNonce;
        this.newNonce = newNonce;
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeTLBytes(pq, stream);
        writeTLBytes(p, stream);
        writeTLBytes(q, stream);
        writeByteArray(nonce, stream);
        writeByteArray(serverNonce, stream);
        writeByteArray(newNonce, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        pq = readTLBytes(stream);
        p = readTLBytes(stream);
        q = readTLBytes(stream);
        nonce = readBytes(16, stream);
        serverNonce = readBytes(16, stream);
        newNonce = readBytes(32, stream);
    }
}
