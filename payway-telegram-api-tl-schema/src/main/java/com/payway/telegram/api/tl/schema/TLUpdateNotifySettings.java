package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateNotifySettings extends TLAbstractUpdate { 

public static final int CLASS_ID = 0xbec268ef;

protected com.payway.telegram.api.tl.schema.TLAbstractNotifyPeer peer;
protected com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings notifySettings;

public TLUpdateNotifySettings() {}

public TLUpdateNotifySettings (com.payway.telegram.api.tl.schema.TLAbstractNotifyPeer peer, com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings notifySettings) {
this.peer = peer;
this.notifySettings = notifySettings;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractNotifyPeer getPeer() {
return peer;
}

public void setPeer(com.payway.telegram.api.tl.schema.TLAbstractNotifyPeer value) {
this.peer = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings getNotifySettings() {
return notifySettings;
}

public void setNotifySettings(com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings value) {
this.notifySettings = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.peer, stream);
writeTLObject(this.notifySettings, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.peer = (com.payway.telegram.api.tl.schema.TLAbstractNotifyPeer)readTLObject(stream, context);
this.notifySettings = (com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings)readTLObject(stream, context);
}

@Override
public String toString() {
return "updateNotifySettings#bec268ef";
}
}