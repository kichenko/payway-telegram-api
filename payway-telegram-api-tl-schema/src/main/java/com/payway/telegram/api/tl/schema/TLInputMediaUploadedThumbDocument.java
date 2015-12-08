package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMediaUploadedThumbDocument extends TLAbstractInputMedia { 

public static final int CLASS_ID = 1044831837;

protected com.payway.telegram.api.tl.schema.TLAbstractInputFile file;
protected com.payway.telegram.api.tl.schema.TLAbstractInputFile thumb;
protected String fileName;
protected String mimeType;

public TLInputMediaUploadedThumbDocument() {}

public TLInputMediaUploadedThumbDocument (com.payway.telegram.api.tl.schema.TLAbstractInputFile file, com.payway.telegram.api.tl.schema.TLAbstractInputFile thumb, String fileName, String mimeType) {
this.file = file;
this.thumb = thumb;
this.fileName = fileName;
this.mimeType = mimeType;
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


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.file, stream);
writeTLObject(this.thumb, stream);
writeTLString(this.fileName, stream);
writeTLString(this.mimeType, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.file = (com.payway.telegram.api.tl.schema.TLAbstractInputFile)readTLObject(stream, context);
this.thumb = (com.payway.telegram.api.tl.schema.TLAbstractInputFile)readTLObject(stream, context);
this.fileName = readTLString(stream);
this.mimeType = readTLString(stream);
}

@Override
public String toString() {
return "inputMediaUploadedThumbDocument#1044831837";
}
}