package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAccountUpdateNotifySettingsMethod extends TLMethod<com.payway.telegram.api.tl.core.TLBool> {

public static final int CLASS_ID = 0x84be5b93;

protected com.payway.telegram.api.tl.schema.TLAbstractInputNotifyPeer peer;
protected com.payway.telegram.api.tl.schema.TLInputPeerNotifySettings settings;

public TLAccountUpdateNotifySettingsMethod (com.payway.telegram.api.tl.schema.TLAbstractInputNotifyPeer peer, com.payway.telegram.api.tl.schema.TLInputPeerNotifySettings settings) {
this.peer = peer;
this.settings = settings;
}

public com.payway.telegram.api.tl.core.TLBool deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.core.TLBool) {return (com.payway.telegram.api.tl.core.TLBool)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.core.TLBool, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.schema.TLAbstractInputNotifyPeer getPeer() {
return peer;
}

public void setPeer(com.payway.telegram.api.tl.schema.TLAbstractInputNotifyPeer value) {
this.peer = value;
}

public com.payway.telegram.api.tl.schema.TLInputPeerNotifySettings getSettings() {
return settings;
}

public void setSettings(com.payway.telegram.api.tl.schema.TLInputPeerNotifySettings value) {
this.settings = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.peer, stream);
writeTLObject(this.settings, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.peer = (com.payway.telegram.api.tl.schema.TLAbstractInputNotifyPeer)readTLObject(stream, context);
this.settings = (com.payway.telegram.api.tl.schema.TLInputPeerNotifySettings)readTLObject(stream, context);
}

@Override
public String toString() {
return "account.updateNotifySettings#84be5b93";
}
}
