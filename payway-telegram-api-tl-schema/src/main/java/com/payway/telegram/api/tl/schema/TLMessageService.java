package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessageService extends TLAbstractMessage { 

public static final int CLASS_ID = 495384334;

protected int flags;
protected int fromId;
protected com.payway.telegram.api.tl.schema.TLAbstractPeer toId;
protected int date;
protected com.payway.telegram.api.tl.schema.TLAbstractMessageAction action;

public TLMessageService() {}

public TLMessageService (int flags, int id, int fromId, com.payway.telegram.api.tl.schema.TLAbstractPeer toId, int date, com.payway.telegram.api.tl.schema.TLAbstractMessageAction action) {
this.flags = flags;
this.id = id;
this.fromId = fromId;
this.toId = toId;
this.date = date;
this.action = action;
}

public int getClassId() {
return CLASS_ID;
}
public int getFlags() {
return flags;
}

public void setFlags(int value) {
this.flags = value;
}

public int getFromId() {
return fromId;
}

public void setFromId(int value) {
this.fromId = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractPeer getToId() {
return toId;
}

public void setToId(com.payway.telegram.api.tl.schema.TLAbstractPeer value) {
this.toId = value;
}

public int getDate() {
return date;
}

public void setDate(int value) {
this.date = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractMessageAction getAction() {
return action;
}

public void setAction(com.payway.telegram.api.tl.schema.TLAbstractMessageAction value) {
this.action = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.flags, stream);
writeInt(this.id, stream);
writeInt(this.fromId, stream);
writeTLObject(this.toId, stream);
writeInt(this.date, stream);
writeTLObject(this.action, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.flags = readInt(stream);
this.id = readInt(stream);
this.fromId = readInt(stream);
this.toId = (com.payway.telegram.api.tl.schema.TLAbstractPeer)readTLObject(stream, context);
this.date = readInt(stream);
this.action = (com.payway.telegram.api.tl.schema.TLAbstractMessageAction)readTLObject(stream, context);
}

@Override
public String toString() {
return "messageService#495384334";
}
}