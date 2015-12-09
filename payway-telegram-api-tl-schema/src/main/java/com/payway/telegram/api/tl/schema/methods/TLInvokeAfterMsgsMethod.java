package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInvokeAfterMsgsMethod extends TLMethod<TLObject> {

public static final int CLASS_ID = 0x3dc4b4f0;

protected com.payway.telegram.api.tl.core.TLLongVector msgIds;
protected TLMethod query;

public TLInvokeAfterMsgsMethod (com.payway.telegram.api.tl.core.TLLongVector msgIds, TLMethod query) {
this.msgIds = msgIds;
this.query = query;
}

public TLObject deserializeResponse(InputStream stream, TLContext context) throws IOException {
return (TLObject) query.deserializeResponse(stream, context);
}

public com.payway.telegram.api.tl.core.TLLongVector getMsgIds() {
return msgIds;
}

public void setMsgIds(com.payway.telegram.api.tl.core.TLLongVector value) {
this.msgIds = value;
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
writeTLVector(this.msgIds, stream);
writeTLMethod(this.query, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.msgIds = readTLLongVector(stream, context);
this.query = readTLMethod(stream, context);
}

@Override
public String toString() {
return "invokeAfterMsgs#3dc4b4f0";
}
}
