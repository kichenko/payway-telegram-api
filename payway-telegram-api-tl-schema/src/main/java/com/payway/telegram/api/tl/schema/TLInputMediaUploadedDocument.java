package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMediaUploadedDocument extends TLAbstractInputMedia { 

public static final int CLASS_ID = 0xffe76b78;

protected com.payway.telegram.api.tl.schema.TLAbstractInputFile file;
protected String mimeType;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractDocumentAttribute> attributes;

public TLInputMediaUploadedDocument() {}

public TLInputMediaUploadedDocument (com.payway.telegram.api.tl.schema.TLAbstractInputFile file, String mimeType, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractDocumentAttribute> attributes) {
this.file = file;
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
writeTLString(this.mimeType, stream);
writeTLVector(this.attributes, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.file = (com.payway.telegram.api.tl.schema.TLAbstractInputFile)readTLObject(stream, context);
this.mimeType = readTLString(stream);
this.attributes = readTLVector(stream, context);
}

@Override
public String toString() {
return "inputMediaUploadedDocument#ffe76b78";
}
}