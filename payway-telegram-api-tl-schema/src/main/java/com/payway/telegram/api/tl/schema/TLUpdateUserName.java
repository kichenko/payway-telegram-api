package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateUserName extends TLAbstractUpdate { 

public static final int CLASS_ID = 0xa7332b73;

protected int userId;
protected String firstName;
protected String lastName;
protected String username;

public TLUpdateUserName() {}

public TLUpdateUserName (int userId, String firstName, String lastName, String username) {
this.userId = userId;
this.firstName = firstName;
this.lastName = lastName;
this.username = username;
}

public int getClassId() {
return CLASS_ID;
}
public int getUserId() {
return userId;
}

public void setUserId(int value) {
this.userId = value;
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

public String getUsername() {
return username;
}

public void setUsername(String value) {
this.username = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.userId, stream);
writeTLString(this.firstName, stream);
writeTLString(this.lastName, stream);
writeTLString(this.username, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.userId = readInt(stream);
this.firstName = readTLString(stream);
this.lastName = readTLString(stream);
this.username = readTLString(stream);
}

@Override
public String toString() {
return "updateUserName#a7332b73";
}
}