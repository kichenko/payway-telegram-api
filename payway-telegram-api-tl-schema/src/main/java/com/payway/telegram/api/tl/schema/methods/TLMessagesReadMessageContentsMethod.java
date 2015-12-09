package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesReadMessageContentsMethod extends TLMethod<com.payway.telegram.api.tl.core.TLIntVector> {

public static final int CLASS_ID = 0x354b5bc2;

protected com.payway.telegram.api.tl.core.TLIntVector id;

public TLMessagesReadMessageContentsMethod (com.payway.telegram.api.tl.core.TLIntVector id) {
this.id = id;
}

public com.payway.telegram.api.tl.core.TLIntVector deserializeResponse(InputStream stream, TLContext context) throws IOException {
return readTLIntVector(stream, context);
}

public com.payway.telegram.api.tl.core.TLIntVector getId() {
return id;
}

public void setId(com.payway.telegram.api.tl.core.TLIntVector value) {
this.id = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.id, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readTLIntVector(stream, context);
}

@Override
public String toString() {
return "messages.readMessageContents#354b5bc2";
}
}
