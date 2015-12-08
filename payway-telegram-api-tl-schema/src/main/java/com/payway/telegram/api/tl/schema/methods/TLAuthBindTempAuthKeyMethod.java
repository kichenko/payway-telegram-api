package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAuthBindTempAuthKeyMethod extends TLMethod<com.payway.telegram.api.tl.core.TLBool> {

public static final int CLASS_ID = -841733627;

protected long permAuthKeyId;
protected long nonce;
protected int expiresAt;
protected TLBytes encryptedMessage;

public TLAuthBindTempAuthKeyMethod (long permAuthKeyId, long nonce, int expiresAt, TLBytes encryptedMessage) {
this.permAuthKeyId = permAuthKeyId;
this.nonce = nonce;
this.expiresAt = expiresAt;
this.encryptedMessage = encryptedMessage;
}

public com.payway.telegram.api.tl.core.TLBool deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.core.TLBool) {return (com.payway.telegram.api.tl.core.TLBool)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.core.TLBool, got: " + res.getClass().getCanonicalName()); }
}

public long getPermAuthKeyId() {
return permAuthKeyId;
}

public void setPermAuthKeyId(long value) {
this.permAuthKeyId = value;
}

public long getNonce() {
return nonce;
}

public void setNonce(long value) {
this.nonce = value;
}

public int getExpiresAt() {
return expiresAt;
}

public void setExpiresAt(int value) {
this.expiresAt = value;
}

public TLBytes getEncryptedMessage() {
return encryptedMessage;
}

public void setEncryptedMessage(TLBytes value) {
this.encryptedMessage = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeLong(this.permAuthKeyId, stream);
writeLong(this.nonce, stream);
writeInt(this.expiresAt, stream);
writeTLBytes(this.encryptedMessage, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.permAuthKeyId = readLong(stream);
this.nonce = readLong(stream);
this.expiresAt = readInt(stream);
this.encryptedMessage = readTLBytes(stream, context);
}

@Override
public String toString() {
return "auth.bindTempAuthKey#-841733627";
}
}
