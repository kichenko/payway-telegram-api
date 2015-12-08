package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public abstract class TLAbstractChatParticipants extends TLObject {

protected int chatId;

public int getChatId() {
return chatId;
}

public void setChatId(int value) {
this.chatId = value;
}


}