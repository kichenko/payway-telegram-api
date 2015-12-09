package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInvokeAfterMsgMethod extends TLMethod<TLObject> {

public static final int CLASS_ID = 0xcb9f372d;

protected long msgId;
protected TLMethod query;

public TLInvokeAfterMsgMethod (long msgId, TLMethod query) {
this.msgId = msgId;
this.query = query;
}

public TLObject deserializeResponse(InputStream stream, TLContext context) throws IOException {
return (TLObject) query.deserializeResponse(stream, context);
}

public long getMsgId() {
return msgId;
}

public void setMsgId(long value) {
this.msgId = value;
}

public TLMethod getQuery() {
return query;
}

public void setQuery(TLMethod value) {
this.query = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeLong(this.msgId, stream);
writeTLMethod(this.query, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.msgId = readLong(stream);
this.query = readTLMethod(stream, context);
}

@Override
public String toString() {
return "invokeAfterMsg#cb9f372d";
}
}
