package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesEditChatTitleMethod extends TLMethod<com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessage> {

public static final int CLASS_ID = 0xb4bc68b5;

protected int chatId;
protected String title;

public TLMessagesEditChatTitleMethod (int chatId, String title) {
this.chatId = chatId;
this.title = title;
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

public String getTitle() {
return title;
}

public void setTitle(String value) {
this.title = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.chatId, stream);
writeTLString(this.title, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.chatId = readInt(stream);
this.title = readTLString(stream);
}

@Override
public String toString() {
return "messages.editChatTitle#b4bc68b5";
}
}
