package com.payway.telegram.api.tl.schema.contacts;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLSuggested extends TLObject {

public static final int CLASS_ID = 1447681221;

protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLContactSuggested> results;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users;

public TLSuggested() {}

public TLSuggested (com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLContactSuggested> results, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users) {
this.results = results;
this.users = users;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLContactSuggested> getResults() {
return results;
}

public void setResults(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLContactSuggested> value) {
this.results = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> getUsers() {
return users;
}

public void setUsers(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> value) {
this.users = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.results, stream);
writeTLVector(this.users, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.results = readTLVector(stream, context);
this.users = readTLVector(stream, context);
}

@Override
public String toString() {
return "contacts.suggested#1447681221";
}
}
