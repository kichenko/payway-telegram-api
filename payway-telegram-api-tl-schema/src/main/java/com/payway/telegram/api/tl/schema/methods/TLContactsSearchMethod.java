package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLContactsSearchMethod extends TLMethod<com.payway.telegram.api.tl.schema.contacts.TLFound> {

public static final int CLASS_ID = 0x11f812d8;

protected String q;
protected int limit;

public TLContactsSearchMethod (String q, int limit) {
this.q = q;
this.limit = limit;
}

public com.payway.telegram.api.tl.schema.contacts.TLFound deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.contacts.TLFound) {return (com.payway.telegram.api.tl.schema.contacts.TLFound)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.contacts.TLFound, got: " + res.getClass().getCanonicalName()); }
}

public String getQ() {
return q;
}

public void setQ(String value) {
this.q = value;
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
writeTLString(this.q, stream);
writeInt(this.limit, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.q = readTLString(stream);
this.limit = readInt(stream);
}

@Override
public String toString() {
return "contacts.search#11f812d8";
}
}
