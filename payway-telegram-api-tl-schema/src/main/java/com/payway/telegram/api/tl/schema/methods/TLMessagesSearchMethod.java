package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesSearchMethod extends TLMethod<com.payway.telegram.api.tl.schema.messages.TLAbstractMessages> {

public static final int CLASS_ID = 132772523;

protected com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer;
protected String q;
protected com.payway.telegram.api.tl.schema.TLAbstractMessagesFilter filter;
protected int minDate;
protected int maxDate;
protected int offset;
protected int maxId;
protected int limit;

public TLMessagesSearchMethod (com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer, String q, com.payway.telegram.api.tl.schema.TLAbstractMessagesFilter filter, int minDate, int maxDate, int offset, int maxId, int limit) {
this.peer = peer;
this.q = q;
this.filter = filter;
this.minDate = minDate;
this.maxDate = maxDate;
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

public String getQ() {
return q;
}

public void setQ(String value) {
this.q = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractMessagesFilter getFilter() {
return filter;
}

public void setFilter(com.payway.telegram.api.tl.schema.TLAbstractMessagesFilter value) {
this.filter = value;
}

public int getMinDate() {
return minDate;
}

public void setMinDate(int value) {
this.minDate = value;
}

public int getMaxDate() {
return maxDate;
}

public void setMaxDate(int value) {
this.maxDate = value;
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
writeTLString(this.q, stream);
writeTLObject(this.filter, stream);
writeInt(this.minDate, stream);
writeInt(this.maxDate, stream);
writeInt(this.offset, stream);
writeInt(this.maxId, stream);
writeInt(this.limit, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.peer = (com.payway.telegram.api.tl.schema.TLAbstractInputPeer)readTLObject(stream, context);
this.q = readTLString(stream);
this.filter = (com.payway.telegram.api.tl.schema.TLAbstractMessagesFilter)readTLObject(stream, context);
this.minDate = readInt(stream);
this.maxDate = readInt(stream);
this.offset = readInt(stream);
this.maxId = readInt(stream);
this.limit = readInt(stream);
}

@Override
public String toString() {
return "messages.search#132772523";
}
}
