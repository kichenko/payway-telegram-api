package com.payway.telegram.api.mtproto.tl.authentication;

import com.payway.telegram.api.tl.core.TLContext;
import com.payway.telegram.api.tl.core.TLMethod;
import com.payway.telegram.api.tl.core.TLObject;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readBytes;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeByteArray;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * ReqPQ
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class ReqPQ extends TLMethod<ResPQ> {

    public static final int CLASS_ID = 0x60469778;

    protected byte[] nonce;

    public ReqPQ(final byte[] nonce) {
        if (nonce == null || nonce.length != 16) {
            throw new IllegalArgumentException("nonce might be not null and 16 bytes length");
        }
        this.nonce = nonce;
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    public void setNonce(final byte[] nonce) {
        if (nonce == null || nonce.length != 16) {
            throw new IllegalArgumentException("nonce might be not null and 16 bytes length");
        }
        this.nonce = nonce;
    }

    @Override
    public ResPQ deserializeResponse(final InputStream stream, final TLContext context) throws IOException {

        final TLObject rsp = context.deserializeMessage(stream);
        if (rsp == null) {
            throw new IOException("Unable to deserialize response");
        }

        if (!(rsp instanceof ResPQ)) {
            throw new IOException("Invalid response type");
        }

        return (ResPQ) rsp;
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeByteArray(nonce, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        nonce = readBytes(16, stream);
    }
}
