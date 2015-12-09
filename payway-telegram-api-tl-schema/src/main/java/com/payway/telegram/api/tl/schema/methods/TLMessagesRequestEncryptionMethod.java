package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesRequestEncryptionMethod extends TLMethod<com.payway.telegram.api.tl.schema.TLAbstractEncryptedChat> {

public static final int CLASS_ID = 0xf64daf43;

protected com.payway.telegram.api.tl.schema.TLAbstractInputUser userId;
protected int randomId;
protected TLBytes gA;

public TLMessagesRequestEncryptionMethod (com.payway.telegram.api.tl.schema.TLAbstractInputUser userId, int randomId, TLBytes gA) {
this.userId = userId;
this.randomId = randomId;
this.gA = gA;
}

public com.payway.telegram.api.tl.schema.TLAbstractEncryptedChat deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.TLAbstractEncryptedChat) {return (com.payway.telegram.api.tl.schema.TLAbstractEncryptedChat)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.TLAbstractEncryptedChat, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.schema.TLAbstractInputUser getUserId() {
return userId;
}

public void setUserId(com.payway.telegram.api.tl.schema.TLAbstractInputUser value) {
this.userId = value;
}

public int getRandomId() {
return randomId;
}

public void setRandomId(int value) {
this.randomId = value;
}

public TLBytes getGA() {
return gA;
}

public void setGA(TLBytes value) {
this.gA = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.userId, stream);
writeInt(this.randomId, stream);
writeTLBytes(this.gA, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.userId = (com.payway.telegram.api.tl.schema.TLAbstractInputUser)readTLObject(stream, context);
this.randomId = readInt(stream);
this.gA = readTLBytes(stream, context);
}

@Override
public String toString() {
return "messages.requestEncryption#f64daf43";
}
}
