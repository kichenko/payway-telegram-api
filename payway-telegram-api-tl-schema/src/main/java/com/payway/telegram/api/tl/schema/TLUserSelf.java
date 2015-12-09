package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUserSelf extends TLAbstractUser { 

public static final int CLASS_ID = 0x7007b451;

protected String firstName;
protected String lastName;
protected String username;
protected String phone;
protected com.payway.telegram.api.tl.schema.TLAbstractUserProfilePhoto photo;
protected com.payway.telegram.api.tl.schema.TLAbstractUserStatus status;
protected boolean inactive;

public TLUserSelf() {}

public TLUserSelf (int id, String firstName, String lastName, String username, String phone, com.payway.telegram.api.tl.schema.TLAbstractUserProfilePhoto photo, com.payway.telegram.api.tl.schema.TLAbstractUserStatus status, boolean inactive) {
this.id = id;
this.firstName = firstName;
this.lastName = lastName;
this.username = username;
this.phone = phone;
this.photo = photo;
this.status = status;
this.inactive = inactive;
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

public String getPhone() {
return phone;
}

public void setPhone(String value) {
this.phone = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractUserProfilePhoto getPhoto() {
return photo;
}

public void setPhoto(com.payway.telegram.api.tl.schema.TLAbstractUserProfilePhoto value) {
this.photo = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractUserStatus getStatus() {
return status;
}

public void setStatus(com.payway.telegram.api.tl.schema.TLAbstractUserStatus value) {
this.status = value;
}

public boolean getInactive() {
return inactive;
}

public void setInactive(boolean value) {
this.inactive = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.id, stream);
writeTLString(this.firstName, stream);
writeTLString(this.lastName, stream);
writeTLString(this.username, stream);
writeTLString(this.phone, stream);
writeTLObject(this.photo, stream);
writeTLObject(this.status, stream);
writeTLBool(this.inactive, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readInt(stream);
this.firstName = readTLString(stream);
this.lastName = readTLString(stream);
this.username = readTLString(stream);
this.phone = readTLString(stream);
this.photo = (com.payway.telegram.api.tl.schema.TLAbstractUserProfilePhoto)readTLObject(stream, context);
this.status = (com.payway.telegram.api.tl.schema.TLAbstractUserStatus)readTLObject(stream, context);
this.inactive = readTLBool(stream);
}

@Override
public String toString() {
return "userSelf#7007b451";
}
}