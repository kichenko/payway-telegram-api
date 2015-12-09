package com.payway.telegram.api.mtproto.tl.authentication;

import com.payway.telegram.api.tl.core.TLContext;
import com.payway.telegram.api.tl.core.TLMethod;
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
 * ReqDhParams
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class ReqDhParams extends TLMethod<ServerDhParams> {

    public static final int CLASS_ID = 0xd712e4be;

    protected byte[] nonce;
    protected byte[] serverNonce;
    protected byte[] p;
    protected byte[] q;
    protected long fingerPrint;
    protected byte[] encryptedData;

    public ReqDhParams(
            final byte[] nonce,
            final byte[] serverNonce,
            final byte[] p,
            final byte[] q,
            final long fingerPrint,
            final byte[] encryptedData
    ) {
        this.p = p;
        this.q = q;
        this.nonce = nonce;
        this.serverNonce = serverNonce;
        this.fingerPrint = fingerPrint;
        this.encryptedData = encryptedData;
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public ServerDhParams deserializeResponse(final InputStream stream, final TLContext context) throws IOException {

        final TLObject rsp = context.deserializeMessage(stream);
        if (rsp == null) {
            throw new IOException("Unable to deserialize response");
        }

        if (!(rsp instanceof ServerDhParams)) {
            throw new IOException("Invalid response type");
        }

        return (ServerDhParams) rsp;
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeByteArray(nonce, stream);
        writeByteArray(serverNonce, stream);
        writeTLBytes(p, stream);
        writeTLBytes(q, stream);
        writeLong(fingerPrint, stream);
        writeTLBytes(encryptedData, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        nonce = readBytes(16, stream);
        serverNonce = readBytes(16, stream);
        p = readTLBytes(stream);
        q = readTLBytes(stream);
        fingerPrint = readLong(stream);
        encryptedData = readTLBytes(stream);
    }
}
