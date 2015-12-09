package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPeerUser extends TLAbstractPeer { 

public static final int CLASS_ID = 0x9db1bc6d;


public TLPeerUser() {}

public TLPeerUser (int userId) {
this.userId = userId;
}

public int getClassId() {
return CLASS_ID;
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
return "peerUser#9db1bc6d";
}
}