package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLDialog extends TLObject {

public static final int CLASS_ID = 0xab3a99ac;

protected com.payway.telegram.api.tl.schema.TLAbstractPeer peer;
protected int topMessage;
protected int unreadCount;
protected com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings notifySettings;

public TLDialog() {}

public TLDialog (com.payway.telegram.api.tl.schema.TLAbstractPeer peer, int topMessage, int unreadCount, com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings notifySettings) {
this.peer = peer;
this.topMessage = topMessage;
this.unreadCount = unreadCount;
this.notifySettings = notifySettings;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractPeer getPeer() {
return peer;
}

public void setPeer(com.payway.telegram.api.tl.schema.TLAbstractPeer value) {
this.peer = value;
}

public int getTopMessage() {
return topMessage;
}

public void setTopMessage(int value) {
this.topMessage = value;
}

public int getUnreadCount() {
return unreadCount;
}

public void setUnreadCount(int value) {
this.unreadCount = value;
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
writeInt(this.topMessage, stream);
writeInt(this.unreadCount, stream);
writeTLObject(this.notifySettings, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.peer = (com.payway.telegram.api.tl.schema.TLAbstractPeer)readTLObject(stream, context);
this.topMessage = readInt(stream);
this.unreadCount = readInt(stream);
this.notifySettings = (com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings)readTLObject(stream, context);
}

@Override
public String toString() {
return "dialog#ab3a99ac";
}
}
