package com.payway.telegram.api.tl.schema.messages;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLChatFull extends TLObject {

public static final int CLASS_ID = 0xe5d7d19c;

protected com.payway.telegram.api.tl.schema.TLChatFull fullChat;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractChat> chats;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users;

public TLChatFull() {}

public TLChatFull (com.payway.telegram.api.tl.schema.TLChatFull fullChat, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractChat> chats, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users) {
this.fullChat = fullChat;
this.chats = chats;
this.users = users;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLChatFull getFullChat() {
return fullChat;
}

public void setFullChat(com.payway.telegram.api.tl.schema.TLChatFull value) {
this.fullChat = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractChat> getChats() {
return chats;
}

public void setChats(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractChat> value) {
this.chats = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> getUsers() {
return users;
}

public void setUsers(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> value) {
this.users = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.fullChat, stream);
writeTLVector(this.chats, stream);
writeTLVector(this.users, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.fullChat = (com.payway.telegram.api.tl.schema.TLChatFull)readTLObject(stream, context);
this.chats = readTLVector(stream, context);
this.users = readTLVector(stream, context);
}

@Override
public String toString() {
return "messages.chatFull#e5d7d19c";
}
}
