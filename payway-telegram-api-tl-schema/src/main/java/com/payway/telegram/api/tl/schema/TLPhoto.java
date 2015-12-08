package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPhoto extends TLAbstractPhoto { 

public static final int CLASS_ID = 582313809;

protected long accessHash;
protected int userId;
protected int date;
protected String caption;
protected com.payway.telegram.api.tl.schema.TLAbstractGeoPoint geo;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractPhotoSize> sizes;

public TLPhoto() {}

public TLPhoto (long id, long accessHash, int userId, int date, String caption, com.payway.telegram.api.tl.schema.TLAbstractGeoPoint geo, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractPhotoSize> sizes) {
this.id = id;
this.accessHash = accessHash;
this.userId = userId;
this.date = date;
this.caption = caption;
this.geo = geo;
this.sizes = sizes;
}

public int getClassId() {
return CLASS_ID;
}
public long getAccessHash() {
return accessHash;
}

public void setAccessHash(long value) {
this.accessHash = value;
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

public String getCaption() {
return caption;
}

public void setCaption(String value) {
this.caption = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractGeoPoint getGeo() {
return geo;
}

public void setGeo(com.payway.telegram.api.tl.schema.TLAbstractGeoPoint value) {
this.geo = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractPhotoSize> getSizes() {
return sizes;
}

public void setSizes(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractPhotoSize> value) {
this.sizes = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeLong(this.id, stream);
writeLong(this.accessHash, stream);
writeInt(this.userId, stream);
writeInt(this.date, stream);
writeTLString(this.caption, stream);
writeTLObject(this.geo, stream);
writeTLVector(this.sizes, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readLong(stream);
this.accessHash = readLong(stream);
this.userId = readInt(stream);
this.date = readInt(stream);
this.caption = readTLString(stream);
this.geo = (com.payway.telegram.api.tl.schema.TLAbstractGeoPoint)readTLObject(stream, context);
this.sizes = readTLVector(stream, context);
}

@Override
public String toString() {
return "photo#582313809";
}
}