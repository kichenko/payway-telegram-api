package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLChatFull extends TLObject {

public static final int CLASS_ID = 1661886910;

protected int id;
protected com.payway.telegram.api.tl.schema.TLAbstractChatParticipants participants;
protected com.payway.telegram.api.tl.schema.TLAbstractPhoto chatPhoto;
protected com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings notifySettings;

public TLChatFull() {}

public TLChatFull (int id, com.payway.telegram.api.tl.schema.TLAbstractChatParticipants participants, com.payway.telegram.api.tl.schema.TLAbstractPhoto chatPhoto, com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings notifySettings) {
this.id = id;
this.participants = participants;
this.chatPhoto = chatPhoto;
this.notifySettings = notifySettings;
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

public com.payway.telegram.api.tl.schema.TLAbstractChatParticipants getParticipants() {
return participants;
}

public void setParticipants(com.payway.telegram.api.tl.schema.TLAbstractChatParticipants value) {
this.participants = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractPhoto getChatPhoto() {
return chatPhoto;
}

public void setChatPhoto(com.payway.telegram.api.tl.schema.TLAbstractPhoto value) {
this.chatPhoto = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings getNotifySettings() {
return notifySettings;
}

public void setNotifySettings(com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings value) {
this.notifySettings = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.id, stream);
writeTLObject(this.participants, stream);
writeTLObject(this.chatPhoto, stream);
writeTLObject(this.notifySettings, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readInt(stream);
this.participants = (com.payway.telegram.api.tl.schema.TLAbstractChatParticipants)readTLObject(stream, context);
this.chatPhoto = (com.payway.telegram.api.tl.schema.TLAbstractPhoto)readTLObject(stream, context);
this.notifySettings = (com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings)readTLObject(stream, context);
}

@Override
public String toString() {
return "chatFull#1661886910";
}
}
