package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesGetHistoryMethod extends TLMethod<com.payway.telegram.api.tl.schema.messages.TLAbstractMessages> {

public static final int CLASS_ID = 0x92a1df2f;

protected com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer;
protected int offset;
protected int maxId;
protected int limit;

public TLMessagesGetHistoryMethod (com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer, int offset, int maxId, int limit) {
this.peer = peer;
this.offset = offset;
this.maxId = maxId;
this.limit = limit;
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractMessages deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.messages.TLAbstractMessages) {return (com.payway.telegram.api.tl.schema.messages.TLAbstractMessages)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.messages.TLAbstractMessages, got: " + res.getClass().getCanonicalName()); }
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

public int getMaxId() {
return maxId;
}

public void setMaxId(int value) {
this.maxId = value;
}

public int getLimit() {
return limit;
}

public void setLimit(int value) {
this.limit = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.peer, stream);
writeInt(this.offset, stream);
writeInt(this.maxId, stream);
writeInt(this.limit, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.peer = (com.payway.telegram.api.tl.schema.TLAbstractInputPeer)readTLObject(stream, context);
this.offset = readInt(stream);
this.maxId = readInt(stream);
this.limit = readInt(stream);
}

@Override
public String toString() {
return "messages.getHistory#92a1df2f";
}
}
