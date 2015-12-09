package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateUserPhoto extends TLAbstractUpdate { 

public static final int CLASS_ID = 0x95313b0c;

protected int userId;
protected int date;
protected com.payway.telegram.api.tl.schema.TLAbstractUserProfilePhoto photo;
protected boolean previous;

public TLUpdateUserPhoto() {}

public TLUpdateUserPhoto (int userId, int date, com.payway.telegram.api.tl.schema.TLAbstractUserProfilePhoto photo, boolean previous) {
this.userId = userId;
this.date = date;
this.photo = photo;
this.previous = previous;
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

public int getDate() {
return date;
}

public void setDate(int value) {
this.date = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractUserProfilePhoto getPhoto() {
return photo;
}

public void setPhoto(com.payway.telegram.api.tl.schema.TLAbstractUserProfilePhoto value) {
this.photo = value;
}

public boolean getPrevious() {
return previous;
}

public void setPrevious(boolean value) {
this.previous = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.userId, stream);
writeInt(this.date, stream);
writeTLObject(this.photo, stream);
writeTLBool(this.previous, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.userId = readInt(stream);
this.date = readInt(stream);
this.photo = (com.payway.telegram.api.tl.schema.TLAbstractUserProfilePhoto)readTLObject(stream, context);
this.previous = readTLBool(stream);
}

@Override
public String toString() {
return "updateUserPhoto#95313b0c";
}
}