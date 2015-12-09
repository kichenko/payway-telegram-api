package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLNotifyPeer extends TLAbstractNotifyPeer { 

public static final int CLASS_ID = 0x9fd40bd8;


public TLNotifyPeer() {}

public TLNotifyPeer (com.payway.telegram.api.tl.schema.TLAbstractPeer peer) {
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
this.peer = (com.payway.telegram.api.tl.schema.TLAbstractPeer)readTLObject(stream, context);
}

@Override
public String toString() {
return "notifyPeer#9fd40bd8";
}
}