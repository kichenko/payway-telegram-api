package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAccountUpdateProfileMethod extends TLMethod<com.payway.telegram.api.tl.schema.TLAbstractUser> {

public static final int CLASS_ID = -259486360;

protected String firstName;
protected String lastName;

public TLAccountUpdateProfileMethod (String firstName, String lastName) {
this.firstName = firstName;
this.lastName = lastName;
}

public com.payway.telegram.api.tl.schema.TLAbstractUser deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.TLAbstractUser) {return (com.payway.telegram.api.tl.schema.TLAbstractUser)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.TLAbstractUser, got: " + res.getClass().getCanonicalName()); }
}

public String getFirstName() {
return firstName;
}

public void setFirstName(String value) {
this.firstName = value;
}

public String getLastName() {
return lastName;
}

public void setLastName(String value) {
this.lastName = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.firstName, stream);
writeTLString(this.lastName, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.firstName = readTLString(stream);
this.lastName = readTLString(stream);
}

@Override
public String toString() {
return "account.updateProfile#-259486360";
}
}
