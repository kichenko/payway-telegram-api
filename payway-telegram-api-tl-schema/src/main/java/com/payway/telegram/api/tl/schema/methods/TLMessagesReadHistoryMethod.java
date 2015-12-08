package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesReadHistoryMethod extends TLMethod<com.payway.telegram.api.tl.schema.messages.TLAffectedHistory> {

public static final int CLASS_ID = -287800122;

protected com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer;
protected int maxId;
protected int offset;
protected boolean readContents;

public TLMessagesReadHistoryMethod (com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer, int maxId, int offset, boolean readContents) {
this.peer = peer;
this.maxId = maxId;
this.offset = offset;
this.readContents = readContents;
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

public int getMaxId() {
return maxId;
}

public void setMaxId(int value) {
this.maxId = value;
}

public int getOffset() {
return offset;
}

public void setOffset(int value) {
this.offset = value;
}

public boolean getReadContents() {
return readContents;
}

public void setReadContents(boolean value) {
this.readContents = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.peer, stream);
writeInt(this.maxId, stream);
writeInt(this.offset, stream);
writeTLBool(this.readContents, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.peer = (com.payway.telegram.api.tl.schema.TLAbstractInputPeer)readTLObject(stream, context);
this.maxId = readInt(stream);
this.offset = readInt(stream);
this.readContents = readTLBool(stream);
}

@Override
public String toString() {
return "messages.readHistory#-287800122";
}
}
