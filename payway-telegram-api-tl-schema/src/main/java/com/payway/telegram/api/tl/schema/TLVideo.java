package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLVideo extends TLAbstractVideo { 

public static final int CLASS_ID = 948937617;

protected long accessHash;
protected int userId;
protected int date;
protected String caption;
protected int duration;
protected String mimeType;
protected int size;
protected com.payway.telegram.api.tl.schema.TLAbstractPhotoSize thumb;
protected int dcId;
protected int w;
protected int h;

public TLVideo() {}

public TLVideo (long id, long accessHash, int userId, int date, String caption, int duration, String mimeType, int size, com.payway.telegram.api.tl.schema.TLAbstractPhotoSize thumb, int dcId, int w, int h) {
this.id = id;
this.accessHash = accessHash;
this.userId = userId;
this.date = date;
this.caption = caption;
this.duration = duration;
this.mimeType = mimeType;
this.size = size;
this.thumb = thumb;
this.dcId = dcId;
this.w = w;
this.h = h;
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

public int getDuration() {
return duration;
}

public void setDuration(int value) {
this.duration = value;
}

public String getMimeType() {
return mimeType;
}

public void setMimeType(String value) {
this.mimeType = value;
}

public int getSize() {
return size;
}

public void setSize(int value) {
this.size = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractPhotoSize getThumb() {
return thumb;
}

public void setThumb(com.payway.telegram.api.tl.schema.TLAbstractPhotoSize value) {
this.thumb = value;
}

public int getDcId() {
return dcId;
}

public void setDcId(int value) {
this.dcId = value;
}

public int getW() {
return w;
}

public void setW(int value) {
this.w = value;
}

public int getH() {
return h;
}

public void setH(int value) {
this.h = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeLong(this.id, stream);
writeLong(this.accessHash, stream);
writeInt(this.userId, stream);
writeInt(this.date, stream);
writeTLString(this.caption, stream);
writeInt(this.duration, stream);
writeTLString(this.mimeType, stream);
writeInt(this.size, stream);
writeTLObject(this.thumb, stream);
writeInt(this.dcId, stream);
writeInt(this.w, stream);
writeInt(this.h, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readLong(stream);
this.accessHash = readLong(stream);
this.userId = readInt(stream);
this.date = readInt(stream);
this.caption = readTLString(stream);
this.duration = readInt(stream);
this.mimeType = readTLString(stream);
this.size = readInt(stream);
this.thumb = (com.payway.telegram.api.tl.schema.TLAbstractPhotoSize)readTLObject(stream, context);
this.dcId = readInt(stream);
this.w = readInt(stream);
this.h = readInt(stream);
}

@Override
public String toString() {
return "video#948937617";
}
}