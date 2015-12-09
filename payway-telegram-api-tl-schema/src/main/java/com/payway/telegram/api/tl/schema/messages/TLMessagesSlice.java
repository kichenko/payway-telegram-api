package com.payway.telegram.api.tl.schema.messages;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesSlice extends TLAbstractMessages { 

public static final int CLASS_ID = 0xb446ae3;

protected int count;

public TLMessagesSlice() {}

public TLMessagesSlice (int count, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractMessage> messages, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractChat> chats, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users) {
this.count = count;
this.messages = messages;
this.chats = chats;
this.users = users;
}

public int getClassId() {
return CLASS_ID;
}
public int getCount() {
return count;
}

public void setCount(int value) {
this.count = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.count, stream);
writeTLVector(this.messages, stream);
writeTLVector(this.chats, stream);
writeTLVector(this.users, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.count = readInt(stream);
this.messages = readTLVector(stream, context);
this.chats = readTLVector(stream, context);
this.users = readTLVector(stream, context);
}

@Override
public String toString() {
return "messages.messagesSlice#b446ae3";
}
}