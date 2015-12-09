package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesGetFullChatMethod extends TLMethod<com.payway.telegram.api.tl.schema.messages.TLChatFull> {

public static final int CLASS_ID = 0x3b831c66;

protected int chatId;

public TLMessagesGetFullChatMethod (int chatId) {
this.chatId = chatId;
}

public com.payway.telegram.api.tl.schema.messages.TLChatFull deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.messages.TLChatFull) {return (com.payway.telegram.api.tl.schema.messages.TLChatFull)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.messages.TLChatFull, got: " + res.getClass().getCanonicalName()); }
}

public int getChatId() {
return chatId;
}

public void setChatId(int value) {
this.chatId = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.chatId, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.chatId = readInt(stream);
}

@Override
public String toString() {
return "messages.getFullChat#3b831c66";
}
}
