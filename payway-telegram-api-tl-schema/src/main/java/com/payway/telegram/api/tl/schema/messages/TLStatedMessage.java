package com.payway.telegram.api.tl.schema.messages;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLStatedMessage extends TLAbstractStatedMessage { 

public static final int CLASS_ID = -797251802;


public TLStatedMessage() {}

public TLStatedMessage (com.payway.telegram.api.tl.schema.TLAbstractMessage message, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractChat> chats, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users, int pts, int seq) {
this.message = message;
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
writeTLObject(this.message, stream);
writeTLVector(this.chats, stream);
writeTLVector(this.users, stream);
writeInt(this.pts, stream);
writeInt(this.seq, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.message = (com.payway.telegram.api.tl.schema.TLAbstractMessage)readTLObject(stream, context);
this.chats = readTLVector(stream, context);
this.users = readTLVector(stream, context);
this.pts = readInt(stream);
this.seq = readInt(stream);
}

@Override
public String toString() {
return "messages.statedMessage#-797251802";
}
}