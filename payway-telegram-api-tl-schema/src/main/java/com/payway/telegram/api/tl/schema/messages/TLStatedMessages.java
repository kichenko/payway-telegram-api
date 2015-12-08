package com.payway.telegram.api.tl.schema.messages;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLStatedMessages extends TLAbstractStatedMessages { 

public static final int CLASS_ID = -1768654661;


public TLStatedMessages() {}

public TLStatedMessages (com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractMessage> messages, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractChat> chats, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users, int pts, int seq) {
this.messages = messages;
this.chats = chats;
this.users = users;
this.pts = pts;
this.seq = seq;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.messages, stream);
writeTLVector(this.chats, stream);
writeTLVector(this.users, stream);
writeInt(this.pts, stream);
writeInt(this.seq, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.messages = readTLVector(stream, context);
this.chats = readTLVector(stream, context);
this.users = readTLVector(stream, context);
this.pts = readInt(stream);
this.seq = readInt(stream);
}

@Override
public String toString() {
return "messages.statedMessages#-1768654661";
}
}