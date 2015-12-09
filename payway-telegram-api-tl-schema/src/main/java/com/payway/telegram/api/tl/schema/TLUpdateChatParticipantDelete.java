package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateChatParticipantDelete extends TLAbstractUpdate { 

public static final int CLASS_ID = 0x6e5f8c22;

protected int chatId;
protected int userId;
protected int version;

public TLUpdateChatParticipantDelete() {}

public TLUpdateChatParticipantDelete (int chatId, int userId, int version) {
this.chatId = chatId;
this.userId = userId;
this.version = version;
}

public int getClassId() {
return CLASS_ID;
}
public int getChatId() {
return chatId;
}

public void setChatId(int value) {
this.chatId = value;
}

public int getUserId() {
return userId;
}

public void setUserId(int value) {
this.userId = value;
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
writeInt(this.userId, stream);
writeInt(this.version, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.chatId = readInt(stream);
this.userId = readInt(stream);
this.version = readInt(stream);
}

@Override
public String toString() {
return "updateChatParticipantDelete#6e5f8c22";
}
}