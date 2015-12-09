package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputNotifyPeer extends TLAbstractInputNotifyPeer { 

public static final int CLASS_ID = 0xb8bc5b0c;


public TLInputNotifyPeer() {}

public TLInputNotifyPeer (com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer) {
this.peer = peer;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.peer, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.peer = (com.payway.telegram.api.tl.schema.TLAbstractInputPeer)readTLObject(stream, context);
}

@Override
public String toString() {
return "inputNotifyPeer#b8bc5b0c";
}
}