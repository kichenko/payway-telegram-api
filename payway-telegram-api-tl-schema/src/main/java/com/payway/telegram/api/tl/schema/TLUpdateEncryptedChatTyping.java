package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateEncryptedChatTyping extends TLAbstractUpdate { 

public static final int CLASS_ID = 386986326;

protected int chatId;

public TLUpdateEncryptedChatTyping() {}

public TLUpdateEncryptedChatTyping (int chatId) {
this.chatId = chatId;
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
return "updateEncryptedChatTyping#386986326";
}
}