package com.payway.telegram.api.mtproto.tl.authentication;

import com.payway.telegram.api.tl.core.TLContext;
import com.payway.telegram.api.tl.core.TLMethod;
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
 * ReqSetDhClientParams
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class ReqSetDhClientParams extends TLMethod<DhGenResult> {

    public static final int CLASS_ID = 0xf5045f1f;

    protected byte[] nonce;
    protected byte[] serverNonce;
    protected byte[] encrypted;

    public ReqSetDhClientParams(final byte[] nonce, final byte[] serverNonce, final byte[] encrypted) {
        this.nonce = nonce;
        this.serverNonce = serverNonce;
        this.encrypted = encrypted;
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public DhGenResult deserializeResponse(final InputStream stream, final TLContext context) throws IOException {

        final TLObject rsp = context.deserializeMessage(stream);
        if (rsp == null) {
            throw new IOException("Unable to deserialize response");
        }

        if (!(rsp instanceof DhGenResult)) {
            throw new IOException("Response has incorrect type");
        }

        return (DhGenResult) rsp;
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeByteArray(nonce, stream);
        writeByteArray(serverNonce, stream);
        writeTLBytes(encrypted, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        nonce = readBytes(16, stream);
        serverNonce = readBytes(16, stream);
        encrypted = readTLBytes(stream);
    }
}
