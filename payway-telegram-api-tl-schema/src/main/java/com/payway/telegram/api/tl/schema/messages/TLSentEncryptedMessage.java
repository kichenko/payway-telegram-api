package com.payway.telegram.api.tl.schema.messages;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLSentEncryptedMessage extends TLAbstractSentEncryptedMessage { 

public static final int CLASS_ID = 1443858741;


public TLSentEncryptedMessage() {}

public TLSentEncryptedMessage (int date) {
this.date = date;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.date, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.date = readInt(stream);
}

@Override
public String toString() {
return "messages.sentEncryptedMessage#1443858741";
}
}