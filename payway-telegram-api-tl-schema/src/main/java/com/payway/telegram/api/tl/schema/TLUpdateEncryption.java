package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateEncryption extends TLAbstractUpdate { 

public static final int CLASS_ID = -1264392051;

protected com.payway.telegram.api.tl.schema.TLAbstractEncryptedChat chat;
protected int date;

public TLUpdateEncryption() {}

public TLUpdateEncryption (com.payway.telegram.api.tl.schema.TLAbstractEncryptedChat chat, int date) {
this.chat = chat;
this.date = date;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractEncryptedChat getChat() {
return chat;
}

public void setChat(com.payway.telegram.api.tl.schema.TLAbstractEncryptedChat value) {
this.chat = value;
}

public int getDate() {
return date;
}

public void setDate(int value) {
this.date = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.chat, stream);
writeInt(this.date, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.chat = (com.payway.telegram.api.tl.schema.TLAbstractEncryptedChat)readTLObject(stream, context);
this.date = readInt(stream);
}

@Override
public String toString() {
return "updateEncryption#-1264392051";
}
}