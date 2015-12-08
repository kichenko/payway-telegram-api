package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputPeerForeign extends TLAbstractInputPeer { 

public static final int CLASS_ID = -1690012891;

protected int userId;
protected long accessHash;

public TLInputPeerForeign() {}

public TLInputPeerForeign (int userId, long accessHash) {
this.userId = userId;
this.accessHash = accessHash;
}

public int getClassId() {
return CLASS_ID;
}
public int getUserId() {
return userId;
}

public void setUserId(int value) {
this.userId = value;
}

public long getAccessHash() {
return accessHash;
}

public void setAccessHash(long value) {
this.accessHash = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.userId, stream);
writeLong(this.accessHash, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.userId = readInt(stream);
this.accessHash = readLong(stream);
}

@Override
public String toString() {
return "inputPeerForeign#-1690012891";
}
}