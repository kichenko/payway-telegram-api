package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessage extends TLAbstractMessage { 

public static final int CLASS_ID = 0x567699b3;

protected int flags;
protected int fromId;
protected com.payway.telegram.api.tl.schema.TLAbstractPeer toId;
protected int date;
protected String message;
protected com.payway.telegram.api.tl.schema.TLAbstractMessageMedia media;

public TLMessage() {}

public TLMessage (int flags, int id, int fromId, com.payway.telegram.api.tl.schema.TLAbstractPeer toId, int date, String message, com.payway.telegram.api.tl.schema.TLAbstractMessageMedia media) {
this.flags = flags;
this.id = id;
this.fromId = fromId;
this.toId = toId;
this.date = date;
this.message = message;
this.media = media;
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

public String getMessage() {
return message;
}

public void setMessage(String value) {
this.message = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractMessageMedia getMedia() {
return media;
}

public void setMedia(com.payway.telegram.api.tl.schema.TLAbstractMessageMedia value) {
this.media = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.flags, stream);
writeInt(this.id, stream);
writeInt(this.fromId, stream);
writeTLObject(this.toId, stream);
writeInt(this.date, stream);
writeTLString(this.message, stream);
writeTLObject(this.media, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.flags = readInt(stream);
this.id = readInt(stream);
this.fromId = readInt(stream);
this.toId = (com.payway.telegram.api.tl.schema.TLAbstractPeer)readTLObject(stream, context);
this.date = readInt(stream);
this.message = readTLString(stream);
this.media = (com.payway.telegram.api.tl.schema.TLAbstractMessageMedia)readTLObject(stream, context);
}

@Override
public String toString() {
return "message#567699b3";
}
}