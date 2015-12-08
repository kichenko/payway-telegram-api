package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesDeleteHistoryMethod extends TLMethod<com.payway.telegram.api.tl.schema.messages.TLAffectedHistory> {

public static final int CLASS_ID = -185009311;

protected com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer;
protected int offset;

public TLMessagesDeleteHistoryMethod (com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer, int offset) {
this.peer = peer;
this.offset = offset;
}

public com.payway.telegram.api.tl.schema.messages.TLAffectedHistory deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.messages.TLAffectedHistory) {return (com.payway.telegram.api.tl.schema.messages.TLAffectedHistory)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.messages.TLAffectedHistory, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.schema.TLAbstractInputPeer getPeer() {
return peer;
}

public void setPeer(com.payway.telegram.api.tl.schema.TLAbstractInputPeer value) {
this.peer = value;
}

public int getOffset() {
return offset;
}

public void setOffset(int value) {
this.offset = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.peer, stream);
writeInt(this.offset, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.peer = (com.payway.telegram.api.tl.schema.TLAbstractInputPeer)readTLObject(stream, context);
this.offset = readInt(stream);
}

@Override
public String toString() {
return "messages.deleteHistory#-185009311";
}
}
