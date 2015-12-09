package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputPeerContact extends TLAbstractInputPeer { 

public static final int CLASS_ID = 0x1023dbe8;

protected int userId;

public TLInputPeerContact() {}

public TLInputPeerContact (int userId) {
this.userId = userId;
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


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.userId, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.userId = readInt(stream);
}

@Override
public String toString() {
return "inputPeerContact#1023dbe8";
}
}