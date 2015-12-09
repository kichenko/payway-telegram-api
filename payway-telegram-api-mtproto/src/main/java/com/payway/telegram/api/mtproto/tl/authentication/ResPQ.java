package com.payway.telegram.api.mtproto.tl.authentication;

import com.payway.telegram.api.tl.core.TLContext;
import com.payway.telegram.api.tl.core.TLLongVector;
import com.payway.telegram.api.tl.core.TLObject;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readBytes;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readTLBytes;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readTLLongVector;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeByteArray;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeTLBytes;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeTLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * ResPQ
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@Setter
@NoArgsConstructor
public class ResPQ extends TLObject {

    public static final int CLASS_ID = 0x05162463;

    protected byte[] nonce;
    protected byte[] serverNonce;
    protected byte[] pq;
    protected TLLongVector fingerprints;

    public ResPQ(
            final byte[] nonce,
            final byte[] serverNonce,
            final byte[] pq,
            final TLLongVector fingerprints
    ) {
        this.nonce = nonce;
        this.serverNonce = serverNonce;
        this.pq = pq;
        this.fingerprints = fingerprints;
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeByteArray(nonce, stream);
        writeByteArray(serverNonce, stream);
        writeTLBytes(pq, stream);
        writeTLVector(fingerprints, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        nonce = readBytes(16, stream);
        serverNonce = readBytes(16, stream);
        pq = readTLBytes(stream);
        fingerprints = readTLLongVector(stream, context);
    }
}
