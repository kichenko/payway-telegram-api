package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputPhoto extends TLAbstractInputPhoto { 

public static final int CLASS_ID = 0xfb95c6c4;

protected long id;
protected long accessHash;

public TLInputPhoto() {}

public TLInputPhoto (long id, long accessHash) {
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
return "inputPhoto#fb95c6c4";
}
}