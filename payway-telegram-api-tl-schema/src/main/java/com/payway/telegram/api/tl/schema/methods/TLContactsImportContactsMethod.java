package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLContactsImportContactsMethod extends TLMethod<com.payway.telegram.api.tl.schema.contacts.TLImportedContacts> {

public static final int CLASS_ID = 0xda30b32d;

protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLInputContact> contacts;
protected boolean replace;

public TLContactsImportContactsMethod (com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLInputContact> contacts, boolean replace) {
this.contacts = contacts;
this.replace = replace;
}

public com.payway.telegram.api.tl.schema.contacts.TLImportedContacts deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.contacts.TLImportedContacts) {return (com.payway.telegram.api.tl.schema.contacts.TLImportedContacts)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.contacts.TLImportedContacts, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLInputContact> getContacts() {
return contacts;
}

public void setContacts(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLInputContact> value) {
this.contacts = value;
}

public boolean getReplace() {
return replace;
}

public void setReplace(boolean value) {
this.replace = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.contacts, stream);
writeTLBool(this.replace, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.contacts = readTLVector(stream, context);
this.replace = readTLBool(stream);
}

@Override
public String toString() {
return "contacts.importContacts#da30b32d";
}
}
