package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInitConnectionMethod extends TLMethod<TLObject> {

public static final int CLASS_ID = 1769565673;

protected int apiId;
protected String deviceModel;
protected String systemVersion;
protected String appVersion;
protected String langCode;
protected TLMethod query;

public TLInitConnectionMethod (int apiId, String deviceModel, String systemVersion, String appVersion, String langCode, TLMethod query) {
this.apiId = apiId;
this.deviceModel = deviceModel;
this.systemVersion = systemVersion;
this.appVersion = appVersion;
this.langCode = langCode;
this.query = query;
}

public TLObject deserializeResponse(InputStream stream, TLContext context) throws IOException {
return (TLObject) query.deserializeResponse(stream, context);
}

public int getApiId() {
return apiId;
}

public void setApiId(int value) {
this.apiId = value;
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

public TLMethod getQuery() {
return query;
}

public void setQuery(TLMethod value) {
this.query = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.apiId, stream);
writeTLString(this.deviceModel, stream);
writeTLString(this.systemVersion, stream);
writeTLString(this.appVersion, stream);
writeTLString(this.langCode, stream);
writeTLMethod(this.query, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.apiId = readInt(stream);
this.deviceModel = readTLString(stream);
this.systemVersion = readTLString(stream);
this.appVersion = readTLString(stream);
this.langCode = readTLString(stream);
this.query = readTLMethod(stream, context);
}

@Override
public String toString() {
return "initConnection#1769565673";
}
}
