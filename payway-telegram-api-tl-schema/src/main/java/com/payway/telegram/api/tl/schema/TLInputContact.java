package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputContact extends TLObject {

public static final int CLASS_ID = 0xf392b7f4;

protected long clientId;
protected String phone;
protected String firstName;
protected String lastName;

public TLInputContact() {}

public TLInputContact (long clientId, String phone, String firstName, String lastName) {
this.clientId = clientId;
this.phone = phone;
this.firstName = firstName;
this.lastName = lastName;
}

public int getClassId() {
return CLASS_ID;
}
public long getClientId() {
return clientId;
}

public void setClientId(long value) {
this.clientId = value;
}

public String getPhone() {
return phone;
}

public void setPhone(String value) {
this.phone = value;
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


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeLong(this.clientId, stream);
writeTLString(this.phone, stream);
writeTLString(this.firstName, stream);
writeTLString(this.lastName, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.clientId = readLong(stream);
this.phone = readTLString(stream);
this.firstName = readTLString(stream);
this.lastName = readTLString(stream);
}

@Override
public String toString() {
return "inputPhoneContact#f392b7f4";
}
}
