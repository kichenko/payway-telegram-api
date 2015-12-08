package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInvokeWithLayer18Method extends TLMethod<TLObject> {

public static final int CLASS_ID = 479200567;

protected TLMethod query;

public TLInvokeWithLayer18Method (TLMethod query) {
this.query = query;
}

public TLObject deserializeResponse(InputStream stream, TLContext context) throws IOException {
return (TLObject) query.deserializeResponse(stream, context);
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
writeTLMethod(this.query, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.query = readTLMethod(stream, context);
}

@Override
public String toString() {
return "invokeWithLayer18#479200567";
}
}
