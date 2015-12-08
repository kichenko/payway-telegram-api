package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLEncryptedMessage extends TLAbstractEncryptedMessage { 

public static final int CLASS_ID = -317144808;


public TLEncryptedMessage() {}

public TLEncryptedMessage (long randomId, int chatId, int date, TLBytes bytes, com.payway.telegram.api.tl.schema.TLAbstractEncryptedFile file) {
this.randomId = randomId;
this.chatId = chatId;
this.date = date;
this.bytes = bytes;
this.file = file;
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
writeTLObject(this.file, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.randomId = readLong(stream);
this.chatId = readInt(stream);
this.date = readInt(stream);
this.bytes = readTLBytes(stream, context);
this.file = (com.payway.telegram.api.tl.schema.TLAbstractEncryptedFile)readTLObject(stream, context);
}

@Override
public String toString() {
return "encryptedMessage#-317144808";
}
}