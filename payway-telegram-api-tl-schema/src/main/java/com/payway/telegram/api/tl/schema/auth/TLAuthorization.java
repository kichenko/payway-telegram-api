package com.payway.telegram.api.tl.schema.auth;

import com.payway.telegram.api.tl.core.TLContext;
import com.payway.telegram.api.tl.core.TLObject;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readInt;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readTLObject;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeInt;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeTLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TLAuthorization extends TLObject {

    public static final int CLASS_ID = 0xf6b673a4;

    protected int expires;
    protected com.payway.telegram.api.tl.schema.TLAbstractUser user;

    public TLAuthorization() {
    }

    public TLAuthorization(int expires, com.payway.telegram.api.tl.schema.TLAbstractUser user) {
        this.expires = expires;
        this.user = user;
    }

    public int getClassId() {
        return CLASS_ID;
    }

    public int getExpires() {
        return expires;
    }

    public void setExpires(int value) {
        this.expires = value;
    }

    public com.payway.telegram.api.tl.schema.TLAbstractUser getUser() {
        return user;
    }

    public void setUser(com.payway.telegram.api.tl.schema.TLAbstractUser value) {
        this.user = value;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeInt(this.expires, stream);
        writeTLObject(this.user, stream);
    }

    @Override
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        this.expires = readInt(stream);
        this.user = (com.payway.telegram.api.tl.schema.TLAbstractUser) readTLObject(stream, context);
    }

    @Override
    public String toString() {
        return "auth.authorization#f6b673a4";
    }
}
