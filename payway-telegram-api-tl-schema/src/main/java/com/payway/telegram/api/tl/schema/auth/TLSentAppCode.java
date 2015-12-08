package com.payway.telegram.api.tl.schema.auth;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLSentAppCode extends TLAbstractSentCode { 

public static final int CLASS_ID = -484053553;


public TLSentAppCode() {}

public TLSentAppCode (boolean phoneRegistered, String phoneCodeHash, int sendCallTimeout, boolean isPassword) {
this.phoneRegistered = phoneRegistered;
this.phoneCodeHash = phoneCodeHash;
this.sendCallTimeout = sendCallTimeout;
this.isPassword = isPassword;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLBool(this.phoneRegistered, stream);
writeTLString(this.phoneCodeHash, stream);
writeInt(this.sendCallTimeout, stream);
writeTLBool(this.isPassword, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.phoneRegistered = readTLBool(stream);
this.phoneCodeHash = readTLString(stream);
this.sendCallTimeout = readInt(stream);
this.isPassword = readTLBool(stream);
}

@Override
public String toString() {
return "auth.sentAppCode#-484053553";
}
}