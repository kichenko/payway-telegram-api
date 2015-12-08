package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUploadSaveFilePartMethod extends TLMethod<com.payway.telegram.api.tl.core.TLBool> {

public static final int CLASS_ID = -1291540959;

protected long fileId;
protected int filePart;
protected TLBytes bytes;

public TLUploadSaveFilePartMethod (long fileId, int filePart, TLBytes bytes) {
this.fileId = fileId;
this.filePart = filePart;
this.bytes = bytes;
}

public com.payway.telegram.api.tl.core.TLBool deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.core.TLBool) {return (com.payway.telegram.api.tl.core.TLBool)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.core.TLBool, got: " + res.getClass().getCanonicalName()); }
}

public long getFileId() {
return fileId;
}

public void setFileId(long value) {
this.fileId = value;
}

public int getFilePart() {
return filePart;
}

public void setFilePart(int value) {
this.filePart = value;
}

public TLBytes getBytes() {
return bytes;
}

public void setBytes(TLBytes value) {
this.bytes = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeLong(this.fileId, stream);
writeInt(this.filePart, stream);
writeTLBytes(this.bytes, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.fileId = readLong(stream);
this.filePart = readInt(stream);
this.bytes = readTLBytes(stream, context);
}

@Override
public String toString() {
return "upload.saveFilePart#-1291540959";
}
}
