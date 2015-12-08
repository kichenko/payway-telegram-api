package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLEncryptedMessageService extends TLAbstractEncryptedMessage { 

public static final int CLASS_ID = 594758406;


public TLEncryptedMessageService() {}

public TLEncryptedMessageService (long randomId, int chatId, int date, TLBytes bytes) {
this.randomId = randomId;
this.chatId = chatId;
this.date = date;
this.bytes = bytes;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeLong(this.randomId, stream);
writeInt(this.chatId, stream);
writeInt(this.date, stream);
writeTLBytes(this.bytes, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.randomId = readLong(stream);
this.chatId = readInt(stream);
this.date = readInt(stream);
this.bytes = readTLBytes(stream, context);
}

@Override
public String toString() {
return "encryptedMessageService#594758406";
}
}