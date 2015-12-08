package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesAcceptEncryptionMethod extends TLMethod<com.payway.telegram.api.tl.schema.TLAbstractEncryptedChat> {

public static final int CLASS_ID = 1035731989;

protected com.payway.telegram.api.tl.schema.TLInputEncryptedChat peer;
protected TLBytes gB;
protected long keyFingerprint;

public TLMessagesAcceptEncryptionMethod (com.payway.telegram.api.tl.schema.TLInputEncryptedChat peer, TLBytes gB, long keyFingerprint) {
this.peer = peer;
this.gB = gB;
this.keyFingerprint = keyFingerprint;
}

public com.payway.telegram.api.tl.schema.TLAbstractEncryptedChat deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.TLAbstractEncryptedChat) {return (com.payway.telegram.api.tl.schema.TLAbstractEncryptedChat)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.TLAbstractEncryptedChat, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.schema.TLInputEncryptedChat getPeer() {
return peer;
}

public void setPeer(com.payway.telegram.api.tl.schema.TLInputEncryptedChat value) {
this.peer = value;
}

public TLBytes getGB() {
return gB;
}

public void setGB(TLBytes value) {
this.gB = value;
}

public long getKeyFingerprint() {
return keyFingerprint;
}

public void setKeyFingerprint(long value) {
this.keyFingerprint = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.peer, stream);
writeTLBytes(this.gB, stream);
writeLong(this.keyFingerprint, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.peer = (com.payway.telegram.api.tl.schema.TLInputEncryptedChat)readTLObject(stream, context);
this.gB = readTLBytes(stream, context);
this.keyFingerprint = readLong(stream);
}

@Override
public String toString() {
return "messages.acceptEncryption#1035731989";
}
}
