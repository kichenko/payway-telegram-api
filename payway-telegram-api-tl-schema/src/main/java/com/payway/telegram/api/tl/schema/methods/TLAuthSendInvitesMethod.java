package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAuthSendInvitesMethod extends TLMethod<com.payway.telegram.api.tl.core.TLBool> {

public static final int CLASS_ID = 1998331287;

protected com.payway.telegram.api.tl.core.TLStringVector phoneNumbers;
protected String message;

public TLAuthSendInvitesMethod (com.payway.telegram.api.tl.core.TLStringVector phoneNumbers, String message) {
this.phoneNumbers = phoneNumbers;
this.message = message;
}

public com.payway.telegram.api.tl.core.TLBool deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.core.TLBool) {return (com.payway.telegram.api.tl.core.TLBool)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.core.TLBool, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.core.TLStringVector getPhoneNumbers() {
return phoneNumbers;
}

public void setPhoneNumbers(com.payway.telegram.api.tl.core.TLStringVector value) {
this.phoneNumbers = value;
}

public String getMessage() {
return message;
}

public void setMessage(String value) {
this.message = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.phoneNumbers, stream);
writeTLString(this.message, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.phoneNumbers = readTLStringVector(stream, context);
this.message = readTLString(stream);
}

@Override
public String toString() {
return "auth.sendInvites#1998331287";
}
}
