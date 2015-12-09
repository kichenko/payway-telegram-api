package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateEncryptedMessagesRead extends TLAbstractUpdate { 

public static final int CLASS_ID = 0x38fe25b7;

protected int chatId;
protected int maxDate;
protected int date;

public TLUpdateEncryptedMessagesRead() {}

public TLUpdateEncryptedMessagesRead (int chatId, int maxDate, int date) {
this.chatId = chatId;
this.maxDate = maxDate;
this.date = date;
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

public int getMaxDate() {
return maxDate;
}

public void setMaxDate(int value) {
this.maxDate = value;
}

public int getDate() {
return date;
}

public void setDate(int value) {
this.date = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.chatId, stream);
writeInt(this.maxDate, stream);
writeInt(this.date, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.chatId = readInt(stream);
this.maxDate = readInt(stream);
this.date = readInt(stream);
}

@Override
public String toString() {
return "updateEncryptedMessagesRead#38fe25b7";
}
}