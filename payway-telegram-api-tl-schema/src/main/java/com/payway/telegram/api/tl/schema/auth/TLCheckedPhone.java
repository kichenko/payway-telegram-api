package com.payway.telegram.api.tl.schema.auth;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLCheckedPhone extends TLObject {

public static final int CLASS_ID = 0xe300cc3b;

protected boolean phoneRegistered;
protected boolean phoneInvited;

public TLCheckedPhone() {}

public TLCheckedPhone (boolean phoneRegistered, boolean phoneInvited) {
this.phoneRegistered = phoneRegistered;
this.phoneInvited = phoneInvited;
}

public int getClassId() {
return CLASS_ID;
}
public boolean getPhoneRegistered() {
return phoneRegistered;
}

public void setPhoneRegistered(boolean value) {
this.phoneRegistered = value;
}

public boolean getPhoneInvited() {
return phoneInvited;
}

public void setPhoneInvited(boolean value) {
this.phoneInvited = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLBool(this.phoneRegistered, stream);
writeTLBool(this.phoneInvited, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.phoneRegistered = readTLBool(stream);
this.phoneInvited = readTLBool(stream);
}

@Override
public String toString() {
return "auth.checkedPhone#e300cc3b";
}
}
