package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputPrivacyValueAllowUsers extends TLAbstractInputPrivacyRule { 

public static final int CLASS_ID = 0x131cc67f;

protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputUser> users;

public TLInputPrivacyValueAllowUsers() {}

public TLInputPrivacyValueAllowUsers (com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputUser> users) {
this.users = users;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputUser> getUsers() {
return users;
}

public void setUsers(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputUser> value) {
this.users = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.users, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.users = readTLVector(stream, context);
}

@Override
public String toString() {
return "inputPrivacyValueAllowUsers#131cc67f";
}
}