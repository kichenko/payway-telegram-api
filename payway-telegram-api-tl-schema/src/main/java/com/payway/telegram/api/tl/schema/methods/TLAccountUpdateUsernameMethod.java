package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAccountUpdateUsernameMethod extends TLMethod<com.payway.telegram.api.tl.schema.TLAbstractUser> {

public static final int CLASS_ID = 1040964988;

protected String username;

public TLAccountUpdateUsernameMethod (String username) {
this.username = username;
}

public com.payway.telegram.api.tl.schema.TLAbstractUser deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.TLAbstractUser) {return (com.payway.telegram.api.tl.schema.TLAbstractUser)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.TLAbstractUser, got: " + res.getClass().getCanonicalName()); }
}

public String getUsername() {
return username;
}

public void setUsername(String value) {
this.username = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.username, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.username = readTLString(stream);
}

@Override
public String toString() {
return "account.updateUsername#1040964988";
}
}
