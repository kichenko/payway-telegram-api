package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLContactsGetContactsMethod extends TLMethod<com.payway.telegram.api.tl.schema.contacts.TLAbstractContacts> {

public static final int CLASS_ID = 0x22c6aa08;

protected String hash;

public TLContactsGetContactsMethod (String hash) {
this.hash = hash;
}

public com.payway.telegram.api.tl.schema.contacts.TLAbstractContacts deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.contacts.TLAbstractContacts) {return (com.payway.telegram.api.tl.schema.contacts.TLAbstractContacts)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.contacts.TLAbstractContacts, got: " + res.getClass().getCanonicalName()); }
}

public String getHash() {
return hash;
}

public void setHash(String value) {
this.hash = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.hash, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.hash = readTLString(stream);
}

@Override
public String toString() {
return "contacts.getContacts#22c6aa08";
}
}
