package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPhotosGetUserPhotosMethod extends TLMethod<com.payway.telegram.api.tl.schema.photos.TLAbstractPhotos> {

public static final int CLASS_ID = 0xb7ee553c;

protected com.payway.telegram.api.tl.schema.TLAbstractInputUser userId;
protected int offset;
protected int maxId;
protected int limit;

public TLPhotosGetUserPhotosMethod (com.payway.telegram.api.tl.schema.TLAbstractInputUser userId, int offset, int maxId, int limit) {
this.userId = userId;
this.offset = offset;
this.maxId = maxId;
this.limit = limit;
}

public com.payway.telegram.api.tl.schema.photos.TLAbstractPhotos deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.photos.TLAbstractPhotos) {return (com.payway.telegram.api.tl.schema.photos.TLAbstractPhotos)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.photos.TLAbstractPhotos, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.schema.TLAbstractInputUser getUserId() {
return userId;
}

public void setUserId(com.payway.telegram.api.tl.schema.TLAbstractInputUser value) {
this.userId = value;
}

public int getOffset() {
return offset;
}

public void setOffset(int value) {
this.offset = value;
}

public int getMaxId() {
return maxId;
}

public void setMaxId(int value) {
this.maxId = value;
}

public int getLimit() {
return limit;
}

public void setLimit(int value) {
this.limit = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.userId, stream);
writeInt(this.offset, stream);
writeInt(this.maxId, stream);
writeInt(this.limit, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.userId = (com.payway.telegram.api.tl.schema.TLAbstractInputUser)readTLObject(stream, context);
this.offset = readInt(stream);
this.maxId = readInt(stream);
this.limit = readInt(stream);
}

@Override
public String toString() {
return "photos.getUserPhotos#b7ee553c";
}
}
