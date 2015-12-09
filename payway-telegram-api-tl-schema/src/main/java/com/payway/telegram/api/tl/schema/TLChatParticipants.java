package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLChatParticipants extends TLAbstractChatParticipants { 

public static final int CLASS_ID = 0x7841b415;

protected int adminId;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLChatParticipant> participants;
protected int version;

public TLChatParticipants() {}

public TLChatParticipants (int chatId, int adminId, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLChatParticipant> participants, int version) {
this.chatId = chatId;
this.adminId = adminId;
this.participants = participants;
this.version = version;
}

public int getClassId() {
return CLASS_ID;
}
public int getAdminId() {
return adminId;
}

public void setAdminId(int value) {
this.adminId = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLChatParticipant> getParticipants() {
return participants;
}

public void setParticipants(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLChatParticipant> value) {
this.participants = value;
}

public int getVersion() {
return version;
}

public void setVersion(int value) {
this.version = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.chatId, stream);
writeInt(this.adminId, stream);
writeTLVector(this.participants, stream);
writeInt(this.version, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.chatId = readInt(stream);
this.adminId = readInt(stream);
this.participants = readTLVector(stream, context);
this.version = readInt(stream);
}

@Override
public String toString() {
return "chatParticipants#7841b415";
}
}