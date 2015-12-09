package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAuthCheckPhoneMethod extends TLMethod<com.payway.telegram.api.tl.schema.auth.TLCheckedPhone> {

public static final int CLASS_ID = 0x6fe51dfb;

protected String phoneNumber;

public TLAuthCheckPhoneMethod (String phoneNumber) {
this.phoneNumber = phoneNumber;
}

public com.payway.telegram.api.tl.schema.auth.TLCheckedPhone deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.auth.TLCheckedPhone) {return (com.payway.telegram.api.tl.schema.auth.TLCheckedPhone)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.auth.TLCheckedPhone, got: " + res.getClass().getCanonicalName()); }
}

public String getPhoneNumber() {
return phoneNumber;
}

public void setPhoneNumber(String value) {
this.phoneNumber = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.phoneNumber, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.phoneNumber = readTLString(stream);
}

@Override
public String toString() {
return "auth.checkPhone#6fe51dfb";
}
}
