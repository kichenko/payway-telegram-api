package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesSendMessageMethod extends TLMethod<com.payway.telegram.api.tl.schema.messages.TLAbstractSentMessage> {

public static final int CLASS_ID = 1289620139;

protected com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer;
protected String message;
protected long randomId;

public TLMessagesSendMessageMethod (com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer, String message, long randomId) {
this.peer = peer;
this.message = message;
this.randomId = randomId;
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractSentMessage deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.messages.TLAbstractSentMessage) {return (com.payway.telegram.api.tl.schema.messages.TLAbstractSentMessage)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.messages.TLAbstractSentMessage, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.schema.TLAbstractInputPeer getPeer() {
return peer;
}

public void setPeer(com.payway.telegram.api.tl.schema.TLAbstractInputPeer value) {
this.peer = value;
}

public String getMessage() {
return message;
}

public void setMessage(String value) {
this.message = value;
}

public long getRandomId() {
return randomId;
}

public void setRandomId(long value) {
this.randomId = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.peer, stream);
writeTLString(this.message, stream);
writeLong(this.randomId, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.peer = (com.payway.telegram.api.tl.schema.TLAbstractInputPeer)readTLObject(stream, context);
this.message = readTLString(stream);
this.randomId = readLong(stream);
}

@Override
public String toString() {
return "messages.sendMessage#1289620139";
}
}
