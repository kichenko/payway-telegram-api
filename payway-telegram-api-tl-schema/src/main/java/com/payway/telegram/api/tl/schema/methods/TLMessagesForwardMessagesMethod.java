package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesForwardMessagesMethod extends TLMethod<com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessages> {

public static final int CLASS_ID = 1363988751;

protected com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer;
protected com.payway.telegram.api.tl.core.TLIntVector id;

public TLMessagesForwardMessagesMethod (com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer, com.payway.telegram.api.tl.core.TLIntVector id) {
this.peer = peer;
this.id = id;
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessages deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessages) {return (com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessages)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessages, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.schema.TLAbstractInputPeer getPeer() {
return peer;
}

public void setPeer(com.payway.telegram.api.tl.schema.TLAbstractInputPeer value) {
this.peer = value;
}

public com.payway.telegram.api.tl.core.TLIntVector getId() {
return id;
}

public void setId(com.payway.telegram.api.tl.core.TLIntVector value) {
this.id = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.peer, stream);
writeTLVector(this.id, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.peer = (com.payway.telegram.api.tl.schema.TLAbstractInputPeer)readTLObject(stream, context);
this.id = readTLIntVector(stream, context);
}

@Override
public String toString() {
return "messages.forwardMessages#1363988751";
}
}
