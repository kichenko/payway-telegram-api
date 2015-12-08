package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUploadGetFileMethod extends TLMethod<com.payway.telegram.api.tl.schema.upload.TLFile> {

public static final int CLASS_ID = -475607115;

protected com.payway.telegram.api.tl.schema.TLAbstractInputFileLocation location;
protected int offset;
protected int limit;

public TLUploadGetFileMethod (com.payway.telegram.api.tl.schema.TLAbstractInputFileLocation location, int offset, int limit) {
this.location = location;
this.offset = offset;
this.limit = limit;
}

public com.payway.telegram.api.tl.schema.upload.TLFile deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.upload.TLFile) {return (com.payway.telegram.api.tl.schema.upload.TLFile)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.upload.TLFile, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.schema.TLAbstractInputFileLocation getLocation() {
return location;
}

public void setLocation(com.payway.telegram.api.tl.schema.TLAbstractInputFileLocation value) {
this.location = value;
}

public int getOffset() {
return offset;
}

public void setOffset(int value) {
this.offset = value;
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
writeTLObject(this.location, stream);
writeInt(this.offset, stream);
writeInt(this.limit, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.location = (com.payway.telegram.api.tl.schema.TLAbstractInputFileLocation)readTLObject(stream, context);
this.offset = readInt(stream);
this.limit = readInt(stream);
}

@Override
public String toString() {
return "upload.getFile#-475607115";
}
}
