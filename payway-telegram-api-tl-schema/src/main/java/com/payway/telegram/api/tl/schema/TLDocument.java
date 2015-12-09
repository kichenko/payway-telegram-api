package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLDocument extends TLAbstractDocument { 

public static final int CLASS_ID = 0xf9a39f4f;

protected long accessHash;
protected int date;
protected String mimeType;
protected int size;
protected com.payway.telegram.api.tl.schema.TLAbstractPhotoSize thumb;
protected int dcId;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractDocumentAttribute> attributes;

public TLDocument() {}

public TLDocument (long id, long accessHash, int date, String mimeType, int size, com.payway.telegram.api.tl.schema.TLAbstractPhotoSize thumb, int dcId, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractDocumentAttribute> attributes) {
this.id = id;
this.accessHash = accessHash;
this.date = date;
this.mimeType = mimeType;
this.size = size;
this.thumb = thumb;
this.dcId = dcId;
this.attributes = attributes;
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

public int getDate() {
return date;
}

public void setDate(int value) {
this.date = value;
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

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractDocumentAttribute> getAttributes() {
return attributes;
}

public void setAttributes(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractDocumentAttribute> value) {
this.attributes = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeLong(this.id, stream);
writeLong(this.accessHash, stream);
writeInt(this.date, stream);
writeTLString(this.mimeType, stream);
writeInt(this.size, stream);
writeTLObject(this.thumb, stream);
writeInt(this.dcId, stream);
writeTLVector(this.attributes, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readLong(stream);
this.accessHash = readLong(stream);
this.date = readInt(stream);
this.mimeType = readTLString(stream);
this.size = readInt(stream);
this.thumb = (com.payway.telegram.api.tl.schema.TLAbstractPhotoSize)readTLObject(stream, context);
this.dcId = readInt(stream);
this.attributes = readTLVector(stream, context);
}

@Override
public String toString() {
return "document#f9a39f4f";
}
}