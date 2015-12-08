package com.payway.telegram.api.tl.schema.messages;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLSentEncryptedFile extends TLAbstractSentEncryptedMessage { 

public static final int CLASS_ID = -1802240206;

protected com.payway.telegram.api.tl.schema.TLAbstractEncryptedFile file;

public TLSentEncryptedFile() {}

public TLSentEncryptedFile (int date, com.payway.telegram.api.tl.schema.TLAbstractEncryptedFile file) {
this.date = date;
this.file = file;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractEncryptedFile getFile() {
return file;
}

public void setFile(com.payway.telegram.api.tl.schema.TLAbstractEncryptedFile value) {
this.file = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.date, stream);
writeTLObject(this.file, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.date = readInt(stream);
this.file = (com.payway.telegram.api.tl.schema.TLAbstractEncryptedFile)readTLObject(stream, context);
}

@Override
public String toString() {
return "messages.sentEncryptedFile#-1802240206";
}
}