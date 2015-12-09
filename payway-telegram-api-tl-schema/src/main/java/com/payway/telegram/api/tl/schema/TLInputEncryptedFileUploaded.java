package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputEncryptedFileUploaded extends TLAbstractInputEncryptedFile { 

public static final int CLASS_ID = 0x64bd0306;

protected long id;
protected int parts;
protected String md5Checksum;
protected int keyFingerprint;

public TLInputEncryptedFileUploaded() {}

public TLInputEncryptedFileUploaded (long id, int parts, String md5Checksum, int keyFingerprint) {
this.id = id;
this.parts = parts;
this.md5Checksum = md5Checksum;
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

public String getMd5Checksum() {
return md5Checksum;
}

public void setMd5Checksum(String value) {
this.md5Checksum = value;
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
writeTLString(this.md5Checksum, stream);
writeInt(this.keyFingerprint, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readLong(stream);
this.parts = readInt(stream);
this.md5Checksum = readTLString(stream);
this.keyFingerprint = readInt(stream);
}

@Override
public String toString() {
return "inputEncryptedFileUploaded#64bd0306";
}
}