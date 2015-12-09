package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUsersGetFullUserMethod extends TLMethod<com.payway.telegram.api.tl.schema.TLUserFull> {

public static final int CLASS_ID = 0xca30a5b1;

protected com.payway.telegram.api.tl.schema.TLAbstractInputUser id;

public TLUsersGetFullUserMethod (com.payway.telegram.api.tl.schema.TLAbstractInputUser id) {
this.id = id;
}

public com.payway.telegram.api.tl.schema.TLUserFull deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.TLUserFull) {return (com.payway.telegram.api.tl.schema.TLUserFull)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.TLUserFull, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.schema.TLAbstractInputUser getId() {
return id;
}

public void setId(com.payway.telegram.api.tl.schema.TLAbstractInputUser value) {
this.id = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.id, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = (com.payway.telegram.api.tl.schema.TLAbstractInputUser)readTLObject(stream, context);
}

@Override
public String toString() {
return "users.getFullUser#ca30a5b1";
}
}
