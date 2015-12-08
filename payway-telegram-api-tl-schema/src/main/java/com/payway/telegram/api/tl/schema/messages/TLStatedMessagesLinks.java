package com.payway.telegram.api.tl.schema.messages;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLStatedMessagesLinks extends TLAbstractStatedMessages { 

public static final int CLASS_ID = 1047852486;

protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.contacts.TLLink> links;

public TLStatedMessagesLinks() {}

public TLStatedMessagesLinks (com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractMessage> messages, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractChat> chats, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.contacts.TLLink> links, int pts, int seq) {
this.messages = messages;
this.chats = chats;
this.users = users;
this.links = links;
this.pts = pts;
this.seq = seq;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.contacts.TLLink> getLinks() {
return links;
}

public void setLinks(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.contacts.TLLink> value) {
this.links = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.messages, stream);
writeTLVector(this.chats, stream);
writeTLVector(this.users, stream);
writeTLVector(this.links, stream);
writeInt(this.pts, stream);
writeInt(this.seq, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.messages = readTLVector(stream, context);
this.chats = readTLVector(stream, context);
this.users = readTLVector(stream, context);
this.links = readTLVector(stream, context);
this.pts = readInt(stream);
this.seq = readInt(stream);
}

@Override
public String toString() {
return "messages.statedMessagesLinks#1047852486";
}
}