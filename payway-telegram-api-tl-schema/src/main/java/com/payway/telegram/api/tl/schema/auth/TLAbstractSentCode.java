package com.payway.telegram.api.tl.schema.auth;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public abstract class TLAbstractSentCode extends TLObject {

protected boolean phoneRegistered;
protected String phoneCodeHash;
protected int sendCallTimeout;
protected boolean isPassword;

public boolean getPhoneRegistered() {
return phoneRegistered;
}

public void setPhoneRegistered(boolean value) {
this.phoneRegistered = value;
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

public boolean getIsPassword() {
return isPassword;
}

public void setIsPassword(boolean value) {
this.isPassword = value;
}


}