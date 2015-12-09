package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAuthSignInMethod extends TLMethod<com.payway.telegram.api.tl.schema.auth.TLAuthorization> {

public static final int CLASS_ID = 0xbcd51581;

protected String phoneNumber;
protected String phoneCodeHash;
protected String phoneCode;

public TLAuthSignInMethod (String phoneNumber, String phoneCodeHash, String phoneCode) {
this.phoneNumber = phoneNumber;
this.phoneCodeHash = phoneCodeHash;
this.phoneCode = phoneCode;
}

public com.payway.telegram.api.tl.schema.auth.TLAuthorization deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.auth.TLAuthorization) {return (com.payway.telegram.api.tl.schema.auth.TLAuthorization)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.auth.TLAuthorization, got: " + res.getClass().getCanonicalName()); }
}

public String getPhoneNumber() {
return phoneNumber;
}

public void setPhoneNumber(String value) {
this.phoneNumber = value;
}

public String getPhoneCodeHash() {
return phoneCodeHash;
}

public void setPhoneCodeHash(String value) {
this.phoneCodeHash = value;
}

public String getPhoneCode() {
return phoneCode;
}

public void setPhoneCode(String value) {
this.phoneCode = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.phoneNumber, stream);
writeTLString(this.phoneCodeHash, stream);
writeTLString(this.phoneCode, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.phoneNumber = readTLString(stream);
this.phoneCodeHash = readTLString(stream);
this.phoneCode = readTLString(stream);
}

@Override
public String toString() {
return "auth.signIn#bcd51581";
}
}
