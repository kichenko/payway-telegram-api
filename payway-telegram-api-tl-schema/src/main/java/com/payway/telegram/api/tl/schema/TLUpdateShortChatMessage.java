package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateShortChatMessage extends TLAbstractUpdates { 

public static final int CLASS_ID = 724548942;

protected int id;
protected int fromId;
protected int chatId;
protected String message;
protected int pts;
protected int date;
protected int seq;

public TLUpdateShortChatMessage() {}

public TLUpdateShortChatMessage (int id, int fromId, int chatId, String message, int pts, int date, int seq) {
this.id = id;
this.fromId = fromId;
this.chatId = chatId;
this.message = message;
this.pts = pts;
this.date = date;
this.seq = seq;
}

public int getClassId() {
return CLASS_ID;
}
public int getId() {
return id;
}

public void setId(int value) {
this.id = value;
}

public int getFromId() {
return fromId;
}

public void setFromId(int value) {
this.fromId = value;
}

public int getChatId() {
return chatId;
}

public void setChatId(int value) {
this.chatId = value;
}

public String getMessage() {
return message;
}

public void setMessage(String value) {
this.message = value;
}

public int getPts() {
return pts;
}

public void setPts(int value) {
this.pts = value;
}

public int getDate() {
return date;
}

public void setDate(int value) {
this.date = value;
}

public int getSeq() {
return seq;
}

public void setSeq(int value) {
this.seq = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.id, stream);
writeInt(this.fromId, stream);
writeInt(this.chatId, stream);
writeTLString(this.message, stream);
writeInt(this.pts, stream);
writeInt(this.date, stream);
writeInt(this.seq, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readInt(stream);
this.fromId = readInt(stream);
this.chatId = readInt(stream);
this.message = readTLString(stream);
this.pts = readInt(stream);
this.date = readInt(stream);
this.seq = readInt(stream);
}

@Override
public String toString() {
return "updateShortChatMessage#724548942";
}
}