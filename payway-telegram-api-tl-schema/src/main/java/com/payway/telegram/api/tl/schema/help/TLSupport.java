package com.payway.telegram.api.tl.schema.help;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLSupport extends TLObject {

public static final int CLASS_ID = 398898678;

protected String phoneNumber;
protected com.payway.telegram.api.tl.schema.TLAbstractUser user;

public TLSupport() {}

public TLSupport (String phoneNumber, com.payway.telegram.api.tl.schema.TLAbstractUser user) {
this.phoneNumber = phoneNumber;
this.user = user;
}

public int getClassId() {
return CLASS_ID;
}
public String getPhoneNumber() {
return phoneNumber;
}

public void setPhoneNumber(String value) {
this.phoneNumber = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractUser getUser() {
return user;
}

public void setUser(com.payway.telegram.api.tl.schema.TLAbstractUser value) {
this.user = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.phoneNumber, stream);
writeTLObject(this.user, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.phoneNumber = readTLString(stream);
this.user = (com.payway.telegram.api.tl.schema.TLAbstractUser)readTLObject(stream, context);
}

@Override
public String toString() {
return "help.support#398898678";
}
}
