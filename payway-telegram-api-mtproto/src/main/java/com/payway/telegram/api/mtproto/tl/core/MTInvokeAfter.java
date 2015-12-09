package com.payway.telegram.api.mtproto.tl.core;

import com.payway.telegram.api.tl.core.TLContext;
import com.payway.telegram.api.tl.core.TLObject;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeByteArray;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeLong;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * MTInvokeAfter
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class MTInvokeAfter extends TLObject {

    public static final int CLASS_ID = 0xcb9f372d;

    protected long dependMsgId;
    protected byte[] request;

    public MTInvokeAfter(final long dependMsgId, final byte[] request) {
        this.dependMsgId = dependMsgId;
        this.request = request;
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeLong(dependMsgId, stream);
        writeByteArray(request, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        throw new IOException("Unable to deserialize");
    }
}
