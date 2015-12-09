package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLChat extends TLAbstractChat { 

public static final int CLASS_ID = 0x6e9c9bc7;

protected String title;
protected com.payway.telegram.api.tl.schema.TLAbstractChatPhoto photo;
protected int participantsCount;
protected int date;
protected boolean left;
protected int version;

public TLChat() {}

public TLChat (int id, String title, com.payway.telegram.api.tl.schema.TLAbstractChatPhoto photo, int participantsCount, int date, boolean left, int version) {
this.id = id;
this.title = title;
this.photo = photo;
this.participantsCount = participantsCount;
this.date = date;
this.left = left;
this.version = version;
}

public int getClassId() {
return CLASS_ID;
}
public String getTitle() {
return title;
}

public void setTitle(String value) {
this.title = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractChatPhoto getPhoto() {
return photo;
}

public void setPhoto(com.payway.telegram.api.tl.schema.TLAbstractChatPhoto value) {
this.photo = value;
}

public int getParticipantsCount() {
return participantsCount;
}

public void setParticipantsCount(int value) {
this.participantsCount = value;
}

public int getDate() {
return date;
}

public void setDate(int value) {
this.date = value;
}

public boolean getLeft() {
return left;
}

public void setLeft(boolean value) {
this.left = value;
}

public int getVersion() {
return version;
}

public void setVersion(int value) {
this.version = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.id, stream);
writeTLString(this.title, stream);
writeTLObject(this.photo, stream);
writeInt(this.participantsCount, stream);
writeInt(this.date, stream);
writeTLBool(this.left, stream);
writeInt(this.version, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readInt(stream);
this.title = readTLString(stream);
this.photo = (com.payway.telegram.api.tl.schema.TLAbstractChatPhoto)readTLObject(stream, context);
this.participantsCount = readInt(stream);
this.date = readInt(stream);
this.left = readTLBool(stream);
this.version = readInt(stream);
}

@Override
public String toString() {
return "chat#6e9c9bc7";
}
}