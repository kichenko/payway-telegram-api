package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputEncryptedFileBigUploaded extends TLAbstractInputEncryptedFile { 

public static final int CLASS_ID = 767652808;

protected long id;
protected int parts;
protected int keyFingerprint;

public TLInputEncryptedFileBigUploaded() {}

public TLInputEncryptedFileBigUploaded (long id, int parts, int keyFingerprint) {
this.id = id;
this.parts = parts;
this.keyFingerprint = keyFingerprint;
}

public int getClassId() {
return CLASS_ID;
}
public long getId() {
return id;
}

public void setId(long value) {
this.id = value;
}

public int getParts() {
return parts;
}

public void setParts(int value) {
this.parts = value;
}

public int getKeyFingerprint() {
return keyFingerprint;
}

public void setKeyFingerprint(int value) {
this.keyFingerprint = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeLong(this.id, stream);
writeInt(this.parts, stream);
writeInt(this.keyFingerprint, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readLong(stream);
this.parts = readInt(stream);
this.keyFingerprint = readInt(stream);
}

@Override
public String toString() {
return "inputEncryptedFileBigUploaded#767652808";
}
}