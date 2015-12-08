package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUserDeleted extends TLAbstractUser { 

public static final int CLASS_ID = -704549510;

protected String firstName;
protected String lastName;
protected String username;

public TLUserDeleted() {}

public TLUserDeleted (int id, String firstName, String lastName, String username) {
this.id = id;
this.firstName = firstName;
this.lastName = lastName;
this.username = username;
}

public int getClassId() {
return CLASS_ID;
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
writeInt(this.id, stream);
writeTLString(this.firstName, stream);
writeTLString(this.lastName, stream);
writeTLString(this.username, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readInt(stream);
this.firstName = readTLString(stream);
this.lastName = readTLString(stream);
this.username = readTLString(stream);
}

@Override
public String toString() {
return "userDeleted#-704549510";
}
}