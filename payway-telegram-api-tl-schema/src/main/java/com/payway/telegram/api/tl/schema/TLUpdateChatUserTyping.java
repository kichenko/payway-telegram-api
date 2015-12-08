package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateChatUserTyping extends TLAbstractUpdate { 

public static final int CLASS_ID = -1704596961;

protected int chatId;
protected int userId;
protected com.payway.telegram.api.tl.schema.TLAbstractSendMessageAction action;

public TLUpdateChatUserTyping() {}

public TLUpdateChatUserTyping (int chatId, int userId, com.payway.telegram.api.tl.schema.TLAbstractSendMessageAction action) {
this.chatId = chatId;
this.userId = userId;
this.action = action;
}

public int getClassId() {
return CLASS_ID;
}
public int getChatId() {
return chatId;
}

public void setChatId(int value) {
this.chatId = value;
}

public int getUserId() {
return userId;
}

public void setUserId(int value) {
this.userId = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractSendMessageAction getAction() {
return action;
}

public void setAction(com.payway.telegram.api.tl.schema.TLAbstractSendMessageAction value) {
this.action = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.chatId, stream);
writeInt(this.userId, stream);
writeTLObject(this.action, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.chatId = readInt(stream);
this.userId = readInt(stream);
this.action = (com.payway.telegram.api.tl.schema.TLAbstractSendMessageAction)readTLObject(stream, context);
}

@Override
public String toString() {
return "updateChatUserTyping#-1704596961";
}
}