package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAuthSendCodeMethod extends TLMethod<com.payway.telegram.api.tl.schema.auth.TLAbstractSentCode> {

public static final int CLASS_ID = 1988976461;

protected String phoneNumber;
protected int smsType;
protected int apiId;
protected String apiHash;
protected String langCode;

public TLAuthSendCodeMethod (String phoneNumber, int smsType, int apiId, String apiHash, String langCode) {
this.phoneNumber = phoneNumber;
this.smsType = smsType;
this.apiId = apiId;
this.apiHash = apiHash;
this.langCode = langCode;
}

public com.payway.telegram.api.tl.schema.auth.TLAbstractSentCode deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.auth.TLAbstractSentCode) {return (com.payway.telegram.api.tl.schema.auth.TLAbstractSentCode)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.auth.TLAbstractSentCode, got: " + res.getClass().getCanonicalName()); }
}

public String getPhoneNumber() {
return phoneNumber;
}

public void setPhoneNumber(String value) {
this.phoneNumber = value;
}

public int getSmsType() {
return smsType;
}

public void setSmsType(int value) {
this.smsType = value;
}

public int getApiId() {
return apiId;
}

public void setApiId(int value) {
this.apiId = value;
}

public String getApiHash() {
return apiHash;
}

public void setApiHash(String value) {
this.apiHash = value;
}

public String getLangCode() {
return langCode;
}

public void setLangCode(String value) {
this.langCode = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.phoneNumber, stream);
writeInt(this.smsType, stream);
writeInt(this.apiId, stream);
writeTLString(this.apiHash, stream);
writeTLString(this.langCode, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.phoneNumber = readTLString(stream);
this.smsType = readInt(stream);
this.apiId = readInt(stream);
this.apiHash = readTLString(stream);
this.langCode = readTLString(stream);
}

@Override
public String toString() {
return "auth.sendCode#1988976461";
}
}
