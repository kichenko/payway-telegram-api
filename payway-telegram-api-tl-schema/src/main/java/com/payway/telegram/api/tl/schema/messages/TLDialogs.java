package com.payway.telegram.api.tl.schema.messages;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLDialogs extends TLAbstractDialogs { 

public static final int CLASS_ID = 0x15ba6c40;


public TLDialogs() {}

public TLDialogs (com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLDialog> dialogs, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractMessage> messages, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractChat> chats, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users) {
this.dialogs = dialogs;
this.messages = messages;
this.chats = chats;
this.users = users;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.dialogs, stream);
writeTLVector(this.messages, stream);
writeTLVector(this.chats, stream);
writeTLVector(this.users, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.dialogs = readTLVector(stream, context);
this.messages = readTLVector(stream, context);
this.chats = readTLVector(stream, context);
this.users = readTLVector(stream, context);
}

@Override
public String toString() {
return "messages.dialogs#15ba6c40";
}
}