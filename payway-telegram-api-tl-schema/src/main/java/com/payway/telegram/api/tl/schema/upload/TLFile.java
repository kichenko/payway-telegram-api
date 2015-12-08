package com.payway.telegram.api.tl.schema.upload;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLFile extends TLObject {

public static final int CLASS_ID = 157948117;

protected com.payway.telegram.api.tl.schema.storage.TLAbstractFileType type;
protected int mtime;
protected TLBytes bytes;

public TLFile() {}

public TLFile (com.payway.telegram.api.tl.schema.storage.TLAbstractFileType type, int mtime, TLBytes bytes) {
this.type = type;
this.mtime = mtime;
this.bytes = bytes;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.storage.TLAbstractFileType getType() {
return type;
}

public void setType(com.payway.telegram.api.tl.schema.storage.TLAbstractFileType value) {
this.type = value;
}

public int getMtime() {
return mtime;
}

public void setMtime(int value) {
this.mtime = value;
}

public TLBytes getBytes() {
return bytes;
}

public void setBytes(TLBytes value) {
this.bytes = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.type, stream);
writeInt(this.mtime, stream);
writeTLBytes(this.bytes, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.type = (com.payway.telegram.api.tl.schema.storage.TLAbstractFileType)readTLObject(stream, context);
this.mtime = readInt(stream);
this.bytes = readTLBytes(stream, context);
}

@Override
public String toString() {
return "upload.file#157948117";
}
}
