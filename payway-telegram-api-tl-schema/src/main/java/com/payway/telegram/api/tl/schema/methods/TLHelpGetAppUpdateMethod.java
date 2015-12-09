package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLHelpGetAppUpdateMethod extends TLMethod<com.payway.telegram.api.tl.schema.help.TLAbstractAppUpdate> {

public static final int CLASS_ID = 0xc812ac7e;

protected String deviceModel;
protected String systemVersion;
protected String appVersion;
protected String langCode;

public TLHelpGetAppUpdateMethod (String deviceModel, String systemVersion, String appVersion, String langCode) {
this.deviceModel = deviceModel;
this.systemVersion = systemVersion;
this.appVersion = appVersion;
this.langCode = langCode;
}

public com.payway.telegram.api.tl.schema.help.TLAbstractAppUpdate deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.help.TLAbstractAppUpdate) {return (com.payway.telegram.api.tl.schema.help.TLAbstractAppUpdate)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.help.TLAbstractAppUpdate, got: " + res.getClass().getCanonicalName()); }
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
writeTLString(this.deviceModel, stream);
writeTLString(this.systemVersion, stream);
writeTLString(this.appVersion, stream);
writeTLString(this.langCode, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.deviceModel = readTLString(stream);
this.systemVersion = readTLString(stream);
this.appVersion = readTLString(stream);
this.langCode = readTLString(stream);
}

@Override
public String toString() {
return "help.getAppUpdate#c812ac7e";
}
}
