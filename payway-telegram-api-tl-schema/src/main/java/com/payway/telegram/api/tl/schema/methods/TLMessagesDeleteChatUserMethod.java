package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesDeleteChatUserMethod extends TLMethod<com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessage> {

public static final int CLASS_ID = 0xc3c5cd23;

protected int chatId;
protected com.payway.telegram.api.tl.schema.TLAbstractInputUser userId;

public TLMessagesDeleteChatUserMethod (int chatId, com.payway.telegram.api.tl.schema.TLAbstractInputUser userId) {
this.chatId = chatId;
this.userId = userId;
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessage deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessage) {return (com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessage)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessage, got: " + res.getClass().getCanonicalName()); }
}

public int getChatId() {
return chatId;
}

public void setChatId(int value) {
this.chatId = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractInputUser getUserId() {
return userId;
}

public void setUserId(com.payway.telegram.api.tl.schema.TLAbstractInputUser value) {
this.userId = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.chatId, stream);
writeTLObject(this.userId, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.chatId = readInt(stream);
this.userId = (com.payway.telegram.api.tl.schema.TLAbstractInputUser)readTLObject(stream, context);
}

@Override
public String toString() {
return "messages.deleteChatUser#c3c5cd23";
}
}
