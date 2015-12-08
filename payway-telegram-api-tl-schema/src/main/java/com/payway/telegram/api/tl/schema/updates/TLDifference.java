package com.payway.telegram.api.tl.schema.updates;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLDifference extends TLAbstractDifference { 

public static final int CLASS_ID = 16030880;

protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractMessage> newMessages;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractEncryptedMessage> newEncryptedMessages;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUpdate> otherUpdates;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractChat> chats;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users;
protected com.payway.telegram.api.tl.schema.updates.TLState state;

public TLDifference() {}

public TLDifference (com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractMessage> newMessages, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractEncryptedMessage> newEncryptedMessages, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUpdate> otherUpdates, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractChat> chats, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users, com.payway.telegram.api.tl.schema.updates.TLState state) {
this.newMessages = newMessages;
this.newEncryptedMessages = newEncryptedMessages;
this.otherUpdates = otherUpdates;
this.chats = chats;
this.users = users;
this.state = state;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractMessage> getNewMessages() {
return newMessages;
}

public void setNewMessages(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractMessage> value) {
this.newMessages = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractEncryptedMessage> getNewEncryptedMessages() {
return newEncryptedMessages;
}

public void setNewEncryptedMessages(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractEncryptedMessage> value) {
this.newEncryptedMessages = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUpdate> getOtherUpdates() {
return otherUpdates;
}

public void setOtherUpdates(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUpdate> value) {
this.otherUpdates = value;
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

public com.payway.telegram.api.tl.schema.updates.TLState getState() {
return state;
}

public void setState(com.payway.telegram.api.tl.schema.updates.TLState value) {
this.state = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.newMessages, stream);
writeTLVector(this.newEncryptedMessages, stream);
writeTLVector(this.otherUpdates, stream);
writeTLVector(this.chats, stream);
writeTLVector(this.users, stream);
writeTLObject(this.state, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.newMessages = readTLVector(stream, context);
this.newEncryptedMessages = readTLVector(stream, context);
this.otherUpdates = readTLVector(stream, context);
this.chats = readTLVector(stream, context);
this.users = readTLVector(stream, context);
this.state = (com.payway.telegram.api.tl.schema.updates.TLState)readTLObject(stream, context);
}

@Override
public String toString() {
return "updates.difference#16030880";
}
}