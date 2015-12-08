package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputEncryptedChat extends TLObject {

public static final int CLASS_ID = -247351839;

protected int chatId;
protected long accessHash;

public TLInputEncryptedChat() {}

public TLInputEncryptedChat (int chatId, long accessHash) {
this.chatId = chatId;
this.accessHash = accessHash;
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

public long getAccessHash() {
return accessHash;
}

public void setAccessHash(long value) {
this.accessHash = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.chatId, stream);
writeLong(this.accessHash, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.chatId = readInt(stream);
this.accessHash = readLong(stream);
}

@Override
public String toString() {
return "inputEncryptedChat#-247351839";
}
}
