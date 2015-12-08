package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLDocument extends TLAbstractDocument { 

public static final int CLASS_ID = -1627626714;

protected long accessHash;
protected int userId;
protected int date;
protected String fileName;
protected String mimeType;
protected int size;
protected com.payway.telegram.api.tl.schema.TLAbstractPhotoSize thumb;
protected int dcId;

public TLDocument() {}

public TLDocument (long id, long accessHash, int userId, int date, String fileName, String mimeType, int size, com.payway.telegram.api.tl.schema.TLAbstractPhotoSize thumb, int dcId) {
this.id = id;
this.accessHash = accessHash;
this.userId = userId;
this.date = date;
this.fileName = fileName;
this.mimeType = mimeType;
this.size = size;
this.thumb = thumb;
this.dcId = dcId;
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

public String getFileName() {
return fileName;
}

public void setFileName(String value) {
this.fileName = value;
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


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeLong(this.id, stream);
writeLong(this.accessHash, stream);
writeInt(this.userId, stream);
writeInt(this.date, stream);
writeTLString(this.fileName, stream);
writeTLString(this.mimeType, stream);
writeInt(this.size, stream);
writeTLObject(this.thumb, stream);
writeInt(this.dcId, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readLong(stream);
this.accessHash = readLong(stream);
this.userId = readInt(stream);
this.date = readInt(stream);
this.fileName = readTLString(stream);
this.mimeType = readTLString(stream);
this.size = readInt(stream);
this.thumb = (com.payway.telegram.api.tl.schema.TLAbstractPhotoSize)readTLObject(stream, context);
this.dcId = readInt(stream);
}

@Override
public String toString() {
return "document#-1627626714";
}
}