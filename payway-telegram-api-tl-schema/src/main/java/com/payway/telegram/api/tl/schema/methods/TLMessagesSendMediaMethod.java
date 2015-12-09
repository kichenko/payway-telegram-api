package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesSendMediaMethod extends TLMethod<com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessage> {

public static final int CLASS_ID = 0xa3c85d76;

protected com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer;
protected com.payway.telegram.api.tl.schema.TLAbstractInputMedia media;
protected long randomId;

public TLMessagesSendMediaMethod (com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer, com.payway.telegram.api.tl.schema.TLAbstractInputMedia media, long randomId) {
this.peer = peer;
this.media = media;
this.randomId = randomId;
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessage deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessage) {return (com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessage)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessage, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.schema.TLAbstractInputPeer getPeer() {
return peer;
}

public void setPeer(com.payway.telegram.api.tl.schema.TLAbstractInputPeer value) {
this.peer = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractInputMedia getMedia() {
return media;
}

public void setMedia(com.payway.telegram.api.tl.schema.TLAbstractInputMedia value) {
this.media = value;
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
writeTLObject(this.media, stream);
writeLong(this.randomId, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.peer = (com.payway.telegram.api.tl.schema.TLAbstractInputPeer)readTLObject(stream, context);
this.media = (com.payway.telegram.api.tl.schema.TLAbstractInputMedia)readTLObject(stream, context);
this.randomId = readLong(stream);
}

@Override
public String toString() {
return "messages.sendMedia#a3c85d76";
}
}
