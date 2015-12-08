package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessageMediaContact extends TLAbstractMessageMedia { 

public static final int CLASS_ID = 1585262393;

protected String phoneNumber;
protected String firstName;
protected String lastName;
protected int userId;

public TLMessageMediaContact() {}

public TLMessageMediaContact (String phoneNumber, String firstName, String lastName, int userId) {
this.phoneNumber = phoneNumber;
this.firstName = firstName;
this.lastName = lastName;
this.userId = userId;
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

public int getUserId() {
return userId;
}

public void setUserId(int value) {
this.userId = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.phoneNumber, stream);
writeTLString(this.firstName, stream);
writeTLString(this.lastName, stream);
writeInt(this.userId, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.phoneNumber = readTLString(stream);
this.firstName = readTLString(stream);
this.lastName = readTLString(stream);
this.userId = readInt(stream);
}

@Override
public String toString() {
return "messageMediaContact#1585262393";
}
}