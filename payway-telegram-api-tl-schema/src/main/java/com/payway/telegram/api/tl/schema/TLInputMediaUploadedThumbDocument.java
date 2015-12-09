package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMediaUploadedThumbDocument extends TLAbstractInputMedia { 

public static final int CLASS_ID = 0x41481486;

protected com.payway.telegram.api.tl.schema.TLAbstractInputFile file;
protected com.payway.telegram.api.tl.schema.TLAbstractInputFile thumb;
protected String mimeType;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractDocumentAttribute> attributes;

public TLInputMediaUploadedThumbDocument() {}

public TLInputMediaUploadedThumbDocument (com.payway.telegram.api.tl.schema.TLAbstractInputFile file, com.payway.telegram.api.tl.schema.TLAbstractInputFile thumb, String mimeType, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractDocumentAttribute> attributes) {
this.file = file;
this.thumb = thumb;
this.mimeType = mimeType;
this.attributes = attributes;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractInputFile getFile() {
return file;
}

public void setFile(com.payway.telegram.api.tl.schema.TLAbstractInputFile value) {
this.file = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractInputFile getThumb() {
return thumb;
}

public void setThumb(com.payway.telegram.api.tl.schema.TLAbstractInputFile value) {
this.thumb = value;
}

public String getMimeType() {
return mimeType;
}

public void setMimeType(String value) {
this.mimeType = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractDocumentAttribute> getAttributes() {
return attributes;
}

public void setAttributes(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractDocumentAttribute> value) {
this.attributes = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.file, stream);
writeTLObject(this.thumb, stream);
writeTLString(this.mimeType, stream);
writeTLVector(this.attributes, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.file = (com.payway.telegram.api.tl.schema.TLAbstractInputFile)readTLObject(stream, context);
this.thumb = (com.payway.telegram.api.tl.schema.TLAbstractInputFile)readTLObject(stream, context);
this.mimeType = readTLString(stream);
this.attributes = readTLVector(stream, context);
}

@Override
public String toString() {
return "inputMediaUploadedThumbDocument#41481486";
}
}