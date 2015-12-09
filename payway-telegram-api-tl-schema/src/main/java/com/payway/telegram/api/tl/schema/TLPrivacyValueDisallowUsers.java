package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPrivacyValueDisallowUsers extends TLAbstractPrivacyRule { 

public static final int CLASS_ID = 0xc7f49b7;

protected com.payway.telegram.api.tl.core.TLIntVector users;

public TLPrivacyValueDisallowUsers() {}

public TLPrivacyValueDisallowUsers (com.payway.telegram.api.tl.core.TLIntVector users) {
this.users = users;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.core.TLIntVector getUsers() {
return users;
}

public void setUsers(com.payway.telegram.api.tl.core.TLIntVector value) {
this.users = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.users, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.users = readTLIntVector(stream, context);
}

@Override
public String toString() {
return "privacyValueDisallowUsers#c7f49b7";
}
}