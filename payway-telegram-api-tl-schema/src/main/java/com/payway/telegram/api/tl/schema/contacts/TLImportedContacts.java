package com.payway.telegram.api.tl.schema.contacts;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLImportedContacts extends TLObject {

public static final int CLASS_ID = 0xad524315;

protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLImportedContact> imported;
protected com.payway.telegram.api.tl.core.TLLongVector retryContacts;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users;

public TLImportedContacts() {}

public TLImportedContacts (com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLImportedContact> imported, com.payway.telegram.api.tl.core.TLLongVector retryContacts, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users) {
this.imported = imported;
this.retryContacts = retryContacts;
this.users = users;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLImportedContact> getImported() {
return imported;
}

public void setImported(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLImportedContact> value) {
this.imported = value;
}

public com.payway.telegram.api.tl.core.TLLongVector getRetryContacts() {
return retryContacts;
}

public void setRetryContacts(com.payway.telegram.api.tl.core.TLLongVector value) {
this.retryContacts = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> getUsers() {
return users;
}

public void setUsers(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> value) {
this.users = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.imported, stream);
writeTLVector(this.retryContacts, stream);
writeTLVector(this.users, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.imported = readTLVector(stream, context);
this.retryContacts = readTLLongVector(stream, context);
this.users = readTLVector(stream, context);
}

@Override
public String toString() {
return "contacts.importedContacts#ad524315";
}
}
