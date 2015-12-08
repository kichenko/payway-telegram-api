package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLChatParticipantsForbidden extends TLAbstractChatParticipants { 

public static final int CLASS_ID = 265468810;


public TLChatParticipantsForbidden() {}

public TLChatParticipantsForbidden (int chatId) {
this.chatId = chatId;
}

public int getClassId() {
return CLASS_ID;
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
return "chatParticipantsForbidden#265468810";
}
}