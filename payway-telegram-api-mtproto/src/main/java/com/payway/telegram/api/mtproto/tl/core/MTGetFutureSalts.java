package com.payway.telegram.api.mtproto.tl.core;

import com.payway.telegram.api.tl.core.TLContext;
import com.payway.telegram.api.tl.core.TLObject;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readInt;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeInt;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * MTFutureSalt
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class MTGetFutureSalts extends TLObject {

    public static final int CLASS_ID = 0xb921bd04;

    private int num;

    public MTGetFutureSalts(final int num) {
        this.num = num;
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeInt(num, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        num = readInt(stream);
    }
}
