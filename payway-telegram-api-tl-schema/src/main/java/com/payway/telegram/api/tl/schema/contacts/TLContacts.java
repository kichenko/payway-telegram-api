package com.payway.telegram.api.tl.schema.contacts;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLContacts extends TLAbstractContacts { 

public static final int CLASS_ID = 0x6f8b8cb2;

protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLContact> contacts;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users;

public TLContacts() {}

public TLContacts (com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLContact> contacts, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users) {
this.contacts = contacts;
this.users = users;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLContact> getContacts() {
return contacts;
}

public void setContacts(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLContact> value) {
this.contacts = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> getUsers() {
return users;
}

public void setUsers(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> value) {
this.users = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.contacts, stream);
writeTLVector(this.users, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.contacts = readTLVector(stream, context);
this.users = readTLVector(stream, context);
}

@Override
public String toString() {
return "contacts.contacts#6f8b8cb2";
}
}