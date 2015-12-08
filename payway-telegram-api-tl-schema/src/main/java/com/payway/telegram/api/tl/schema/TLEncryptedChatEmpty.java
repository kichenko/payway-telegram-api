package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLEncryptedChatEmpty extends TLAbstractEncryptedChat { 

public static final int CLASS_ID = -1417756512;


public TLEncryptedChatEmpty() {}

public TLEncryptedChatEmpty (int id) {
this.id = id;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.id, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readInt(stream);
}

@Override
public String toString() {
return "encryptedChatEmpty#-1417756512";
}
}