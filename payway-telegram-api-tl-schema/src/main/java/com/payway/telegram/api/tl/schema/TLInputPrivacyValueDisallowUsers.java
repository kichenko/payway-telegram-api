package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputPrivacyValueDisallowUsers extends TLAbstractInputPrivacyRule { 

public static final int CLASS_ID = 0x90110467;

protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputUser> users;

public TLInputPrivacyValueDisallowUsers() {}

public TLInputPrivacyValueDisallowUsers (com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputUser> users) {
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
return "inputPrivacyValueDisallowUsers#90110467";
}
}