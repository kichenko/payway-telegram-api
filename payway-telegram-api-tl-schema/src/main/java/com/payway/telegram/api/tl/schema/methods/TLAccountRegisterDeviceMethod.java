package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAccountRegisterDeviceMethod extends TLMethod<com.payway.telegram.api.tl.core.TLBool> {

public static final int CLASS_ID = 1147957548;

protected int tokenType;
protected String token;
protected String deviceModel;
protected String systemVersion;
protected String appVersion;
protected boolean appSandbox;
protected String langCode;

public TLAccountRegisterDeviceMethod (int tokenType, String token, String deviceModel, String systemVersion, String appVersion, boolean appSandbox, String langCode) {
this.tokenType = tokenType;
this.token = token;
this.deviceModel = deviceModel;
this.systemVersion = systemVersion;
this.appVersion = appVersion;
this.appSandbox = appSandbox;
this.langCode = langCode;
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

public String getDeviceModel() {
return deviceModel;
}

public void setDeviceModel(String value) {
this.deviceModel = value;
}

public String getSystemVersion() {
return systemVersion;
}

public void setSystemVersion(String value) {
this.systemVersion = value;
}

public String getAppVersion() {
return appVersion;
}

public void setAppVersion(String value) {
this.appVersion = value;
}

public boolean getAppSandbox() {
return appSandbox;
}

public void setAppSandbox(boolean value) {
this.appSandbox = value;
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
writeInt(this.tokenType, stream);
writeTLString(this.token, stream);
writeTLString(this.deviceModel, stream);
writeTLString(this.systemVersion, stream);
writeTLString(this.appVersion, stream);
writeTLBool(this.appSandbox, stream);
writeTLString(this.langCode, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.tokenType = readInt(stream);
this.token = readTLString(stream);
this.deviceModel = readTLString(stream);
this.systemVersion = readTLString(stream);
this.appVersion = readTLString(stream);
this.appSandbox = readTLBool(stream);
this.langCode = readTLString(stream);
}

@Override
public String toString() {
return "account.registerDevice#1147957548";
}
}
