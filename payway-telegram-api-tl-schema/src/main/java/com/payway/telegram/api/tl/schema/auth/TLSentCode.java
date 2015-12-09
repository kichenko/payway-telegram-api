package com.payway.telegram.api.tl.schema.auth;

import com.payway.telegram.api.tl.core.TLContext;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readInt;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readTLBool;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readTLString;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeInt;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeTLBool;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeTLString;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TLSentCode extends TLAbstractSentCode {

    public static final int CLASS_ID = 0xefed51d9;

    public TLSentCode() {
    }

    public TLSentCode(boolean phoneRegistered, String phoneCodeHash, int sendCallTimeout, boolean isPassword) {
        this.phoneRegistered = phoneRegistered;
        this.phoneCodeHash = phoneCodeHash;
        this.sendCallTimeout = sendCallTimeout;
        this.isPassword = isPassword;
    }

    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLBool(this.phoneRegistered, stream);
        writeTLString(this.phoneCodeHash, stream);
        writeInt(this.sendCallTimeout, stream);
        writeTLBool(this.isPassword, stream);
    }

    @Override
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        this.phoneRegistered = readTLBool(stream);
        this.phoneCodeHash = readTLString(stream);
        this.sendCallTimeout = readInt(stream);
        this.isPassword = readTLBool(stream);
    }

    @Override
    public String toString() {
        return "auth.sentCode#efed51d9";
    }
}
