package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMediaUploadedDocument extends TLAbstractInputMedia { 

public static final int CLASS_ID = 887592125;

protected com.payway.telegram.api.tl.schema.TLAbstractInputFile file;
protected String fileName;
protected String mimeType;

public TLInputMediaUploadedDocument() {}

public TLInputMediaUploadedDocument (com.payway.telegram.api.tl.schema.TLAbstractInputFile file, String fileName, String mimeType) {
this.file = file;
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
writeTLString(this.fileName, stream);
writeTLString(this.mimeType, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.file = (com.payway.telegram.api.tl.schema.TLAbstractInputFile)readTLObject(stream, context);
this.fileName = readTLString(stream);
this.mimeType = readTLString(stream);
}

@Override
public String toString() {
return "inputMediaUploadedDocument#887592125";
}
}