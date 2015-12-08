package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAccountUnregisterDeviceMethod extends TLMethod<com.payway.telegram.api.tl.core.TLBool> {

public static final int CLASS_ID = 1707432768;

protected int tokenType;
protected String token;

public TLAccountUnregisterDeviceMethod (int tokenType, String token) {
this.tokenType = tokenType;
this.token = token;
}

public com.payway.telegram.api.tl.core.TLBool deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.core.TLBool) {return (com.payway.telegram.api.tl.core.TLBool)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.core.TLBool, got: " + res.getClass().getCanonicalName()); }
}

public int getTokenType() {
return tokenType;
}

public void setTokenType(int value) {
this.tokenType = value;
}

public String getToken() {
return token;
}

public void setToken(String value) {
this.token = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.tokenType, stream);
writeTLString(this.token, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.tokenType = readInt(stream);
this.token = readTLString(stream);
}

@Override
public String toString() {
return "account.unregisterDevice#1707432768";
}
}
