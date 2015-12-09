package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesEditChatPhotoMethod extends TLMethod<com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessage> {

public static final int CLASS_ID = 0xd881821d;

protected int chatId;
protected com.payway.telegram.api.tl.schema.TLAbstractInputChatPhoto photo;

public TLMessagesEditChatPhotoMethod (int chatId, com.payway.telegram.api.tl.schema.TLAbstractInputChatPhoto photo) {
this.chatId = chatId;
this.photo = photo;
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

public com.payway.telegram.api.tl.schema.TLAbstractInputChatPhoto getPhoto() {
return photo;
}

public void setPhoto(com.payway.telegram.api.tl.schema.TLAbstractInputChatPhoto value) {
this.photo = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.chatId, stream);
writeTLObject(this.photo, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.chatId = readInt(stream);
this.photo = (com.payway.telegram.api.tl.schema.TLAbstractInputChatPhoto)readTLObject(stream, context);
}

@Override
public String toString() {
return "messages.editChatPhoto#d881821d";
}
}
