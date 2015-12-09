package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdatesCombined extends TLAbstractUpdates { 

public static final int CLASS_ID = 0x725b04c3;

protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUpdate> updates;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractChat> chats;
protected int date;
protected int seqStart;
protected int seq;

public TLUpdatesCombined() {}

public TLUpdatesCombined (com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUpdate> updates, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractChat> chats, int date, int seqStart, int seq) {
this.updates = updates;
this.users = users;
this.chats = chats;
this.date = date;
this.seqStart = seqStart;
this.seq = seq;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUpdate> getUpdates() {
return updates;
}

public void setUpdates(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUpdate> value) {
this.updates = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> getUsers() {
return users;
}

public void setUsers(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> value) {
this.users = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractChat> getChats() {
return chats;
}

public void setChats(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractChat> value) {
this.chats = value;
}

public int getDate() {
return date;
}

public void setDate(int value) {
this.date = value;
}

public int getSeqStart() {
return seqStart;
}

public void setSeqStart(int value) {
this.seqStart = value;
}

public int getSeq() {
return seq;
}

public void setSeq(int value) {
this.seq = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.updates, stream);
writeTLVector(this.users, stream);
writeTLVector(this.chats, stream);
writeInt(this.date, stream);
writeInt(this.seqStart, stream);
writeInt(this.seq, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.updates = readTLVector(stream, context);
this.users = readTLVector(stream, context);
this.chats = readTLVector(stream, context);
this.date = readInt(stream);
this.seqStart = readInt(stream);
this.seq = readInt(stream);
}

@Override
public String toString() {
return "updatesCombined#725b04c3";
}
}