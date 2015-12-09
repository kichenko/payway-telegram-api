package com.payway.telegram.api.tl.schema.account;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLSentChangePhoneCode extends TLObject {

public static final int CLASS_ID = 0xa4f58c4c;

protected String phoneCodeHash;
protected int sendCallTimeout;

public TLSentChangePhoneCode() {}

public TLSentChangePhoneCode (String phoneCodeHash, int sendCallTimeout) {
this.phoneCodeHash = phoneCodeHash;
this.sendCallTimeout = sendCallTimeout;
}

public int getClassId() {
return CLASS_ID;
}
public String getPhoneCodeHash() {
return phoneCodeHash;
}

public void setPhoneCodeHash(String value) {
this.phoneCodeHash = value;
}

public int getSendCallTimeout() {
return sendCallTimeout;
}

public void setSendCallTimeout(int value) {
this.sendCallTimeout = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.phoneCodeHash, stream);
writeInt(this.sendCallTimeout, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.phoneCodeHash = readTLString(stream);
this.sendCallTimeout = readInt(stream);
}

@Override
public String toString() {
return "account.sentChangePhoneCode#a4f58c4c";
}
}
