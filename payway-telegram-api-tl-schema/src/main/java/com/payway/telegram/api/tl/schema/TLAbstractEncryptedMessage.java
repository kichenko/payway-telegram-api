package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public abstract class TLAbstractEncryptedMessage extends TLObject {

protected long randomId;
protected int chatId;
protected int date;
protected TLBytes bytes;
protected com.payway.telegram.api.tl.schema.TLAbstractEncryptedFile file;

public long getRandomId() {
return randomId;
}

public void setRandomId(long value) {
this.randomId = value;
}

public int getChatId() {
return chatId;
}

public void setChatId(int value) {
this.chatId = value;
}

public int getDate() {
return date;
}

public void setDate(int value) {
this.date = value;
}

public TLBytes getBytes() {
return bytes;
}

public void setBytes(TLBytes value) {
this.bytes = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractEncryptedFile getFile() {
return file;
}

public void setFile(com.payway.telegram.api.tl.schema.TLAbstractEncryptedFile value) {
this.file = value;
}


}