package com.payway.telegram.api.tl.schema.contacts;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLFound extends TLObject {

public static final int CLASS_ID = 90570766;

protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLContactFound> results;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users;

public TLFound() {}

public TLFound (com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLContactFound> results, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users) {
this.results = results;
this.users = users;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLContactFound> getResults() {
return results;
}

public void setResults(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLContactFound> value) {
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
return "contacts.found#90570766";
}
}
