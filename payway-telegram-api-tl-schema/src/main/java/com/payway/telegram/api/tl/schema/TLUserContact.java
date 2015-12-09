package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUserContact extends TLAbstractUser { 

public static final int CLASS_ID = 0xcab35e18;

protected String firstName;
protected String lastName;
protected String username;
protected long accessHash;
protected String phone;
protected com.payway.telegram.api.tl.schema.TLAbstractUserProfilePhoto photo;
protected com.payway.telegram.api.tl.schema.TLAbstractUserStatus status;

public TLUserContact() {}

public TLUserContact (int id, String firstName, String lastName, String username, long accessHash, String phone, com.payway.telegram.api.tl.schema.TLAbstractUserProfilePhoto photo, com.payway.telegram.api.tl.schema.TLAbstractUserStatus status) {
this.id = id;
this.firstName = firstName;
this.lastName = lastName;
this.username = username;
this.accessHash = accessHash;
this.phone = phone;
this.photo = photo;
this.status = status;
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

public long getAccessHash() {
return accessHash;
}

public void setAccessHash(long value) {
this.accessHash = value;
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


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.id, stream);
writeTLString(this.firstName, stream);
writeTLString(this.lastName, stream);
writeTLString(this.username, stream);
writeLong(this.accessHash, stream);
writeTLString(this.phone, stream);
writeTLObject(this.photo, stream);
writeTLObject(this.status, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readInt(stream);
this.firstName = readTLString(stream);
this.lastName = readTLString(stream);
this.username = readTLString(stream);
this.accessHash = readLong(stream);
this.phone = readTLString(stream);
this.photo = (com.payway.telegram.api.tl.schema.TLAbstractUserProfilePhoto)readTLObject(stream, context);
this.status = (com.payway.telegram.api.tl.schema.TLAbstractUserStatus)readTLObject(stream, context);
}

@Override
public String toString() {
return "userContact#cab35e18";
}
}