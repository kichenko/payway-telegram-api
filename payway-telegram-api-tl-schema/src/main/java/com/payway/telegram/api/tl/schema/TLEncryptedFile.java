package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLEncryptedFile extends TLAbstractEncryptedFile { 

public static final int CLASS_ID = 1248893260;

protected long id;
protected long accessHash;
protected int size;
protected int dcId;
protected int keyFingerprint;

public TLEncryptedFile() {}

public TLEncryptedFile (long id, long accessHash, int size, int dcId, int keyFingerprint) {
this.id = id;
this.accessHash = accessHash;
this.size = size;
this.dcId = dcId;
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

public long getAccessHash() {
return accessHash;
}

public void setAccessHash(long value) {
this.accessHash = value;
}

public int getSize() {
return size;
}

public void setSize(int value) {
this.size = value;
}

public int getDcId() {
return dcId;
}

public void setDcId(int value) {
this.dcId = value;
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
writeLong(this.accessHash, stream);
writeInt(this.size, stream);
writeInt(this.dcId, stream);
writeInt(this.keyFingerprint, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readLong(stream);
this.accessHash = readLong(stream);
this.size = readInt(stream);
this.dcId = readInt(stream);
this.keyFingerprint = readInt(stream);
}

@Override
public String toString() {
return "encryptedFile#1248893260";
}
}