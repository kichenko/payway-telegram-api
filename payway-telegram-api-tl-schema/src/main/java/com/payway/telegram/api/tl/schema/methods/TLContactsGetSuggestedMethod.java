package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLContactsGetSuggestedMethod extends TLMethod<com.payway.telegram.api.tl.schema.contacts.TLSuggested> {

public static final int CLASS_ID = 0xcd773428;

protected int limit;

public TLContactsGetSuggestedMethod (int limit) {
this.limit = limit;
}

public com.payway.telegram.api.tl.schema.contacts.TLSuggested deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.contacts.TLSuggested) {return (com.payway.telegram.api.tl.schema.contacts.TLSuggested)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.contacts.TLSuggested, got: " + res.getClass().getCanonicalName()); }
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
writeInt(this.limit, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.limit = readInt(stream);
}

@Override
public String toString() {
return "contacts.getSuggested#cd773428";
}
}
