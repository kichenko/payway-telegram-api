package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesSendEncryptedMethod extends TLMethod<com.payway.telegram.api.tl.schema.messages.TLAbstractSentEncryptedMessage> {

public static final int CLASS_ID = -1451792525;

protected com.payway.telegram.api.tl.schema.TLInputEncryptedChat peer;
protected long randomId;
protected TLBytes data;

public TLMessagesSendEncryptedMethod (com.payway.telegram.api.tl.schema.TLInputEncryptedChat peer, long randomId, TLBytes data) {
this.peer = peer;
this.randomId = randomId;
this.data = data;
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractSentEncryptedMessage deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.messages.TLAbstractSentEncryptedMessage) {return (com.payway.telegram.api.tl.schema.messages.TLAbstractSentEncryptedMessage)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.messages.TLAbstractSentEncryptedMessage, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.schema.TLInputEncryptedChat getPeer() {
return peer;
}

public void setPeer(com.payway.telegram.api.tl.schema.TLInputEncryptedChat value) {
this.peer = value;
}

public long getRandomId() {
return randomId;
}

public void setRandomId(long value) {
this.randomId = value;
}

public TLBytes getData() {
return data;
}

public void setData(TLBytes value) {
this.data = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.peer, stream);
writeLong(this.randomId, stream);
writeTLBytes(this.data, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.peer = (com.payway.telegram.api.tl.schema.TLInputEncryptedChat)readTLObject(stream, context);
this.randomId = readLong(stream);
this.data = readTLBytes(stream, context);
}

@Override
public String toString() {
return "messages.sendEncrypted#-1451792525";
}
}
