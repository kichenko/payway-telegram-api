package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLContactsGetBlockedMethod extends TLMethod<com.payway.telegram.api.tl.schema.contacts.TLAbstractBlocked> {

public static final int CLASS_ID = 0xf57c350f;

protected int offset;
protected int limit;

public TLContactsGetBlockedMethod (int offset, int limit) {
this.offset = offset;
this.limit = limit;
}

public com.payway.telegram.api.tl.schema.contacts.TLAbstractBlocked deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.contacts.TLAbstractBlocked) {return (com.payway.telegram.api.tl.schema.contacts.TLAbstractBlocked)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.contacts.TLAbstractBlocked, got: " + res.getClass().getCanonicalName()); }
}

public int getOffset() {
return offset;
}

public void setOffset(int value) {
this.offset = value;
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
writeInt(this.offset, stream);
writeInt(this.limit, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.offset = readInt(stream);
this.limit = readInt(stream);
}

@Override
public String toString() {
return "contacts.getBlocked#f57c350f";
}
}
