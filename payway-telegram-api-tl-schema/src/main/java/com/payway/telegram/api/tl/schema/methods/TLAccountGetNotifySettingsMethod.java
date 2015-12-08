package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAccountGetNotifySettingsMethod extends TLMethod<com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings> {

public static final int CLASS_ID = 313765169;

protected com.payway.telegram.api.tl.schema.TLAbstractInputNotifyPeer peer;

public TLAccountGetNotifySettingsMethod (com.payway.telegram.api.tl.schema.TLAbstractInputNotifyPeer peer) {
this.peer = peer;
}

public com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings) {return (com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.schema.TLAbstractInputNotifyPeer getPeer() {
return peer;
}

public void setPeer(com.payway.telegram.api.tl.schema.TLAbstractInputNotifyPeer value) {
this.peer = value;
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
this.peer = (com.payway.telegram.api.tl.schema.TLAbstractInputNotifyPeer)readTLObject(stream, context);
}

@Override
public String toString() {
return "account.getNotifySettings#313765169";
}
}
