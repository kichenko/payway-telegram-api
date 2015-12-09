package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputEncryptedFile extends TLAbstractInputEncryptedFile { 

public static final int CLASS_ID = 0x5a17b5e5;

protected long id;
protected long accessHash;

public TLInputEncryptedFile() {}

public TLInputEncryptedFile (long id, long accessHash) {
this.id = id;
this.accessHash = accessHash;
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


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeLong(this.id, stream);
writeLong(this.accessHash, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readLong(stream);
this.accessHash = readLong(stream);
}

@Override
public String toString() {
return "inputEncryptedFile#5a17b5e5";
}
}