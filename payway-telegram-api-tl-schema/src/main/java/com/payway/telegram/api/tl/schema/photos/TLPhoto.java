package com.payway.telegram.api.tl.schema.photos;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPhoto extends TLObject {

public static final int CLASS_ID = 0x20212ca8;

protected com.payway.telegram.api.tl.schema.TLAbstractPhoto photo;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users;

public TLPhoto() {}

public TLPhoto (com.payway.telegram.api.tl.schema.TLAbstractPhoto photo, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users) {
this.photo = photo;
this.users = users;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractPhoto getPhoto() {
return photo;
}

public void setPhoto(com.payway.telegram.api.tl.schema.TLAbstractPhoto value) {
this.photo = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> getUsers() {
return users;
}

public void setUsers(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> value) {
this.users = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.photo, stream);
writeTLVector(this.users, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.photo = (com.payway.telegram.api.tl.schema.TLAbstractPhoto)readTLObject(stream, context);
this.users = readTLVector(stream, context);
}

@Override
public String toString() {
return "photos.photo#20212ca8";
}
}
