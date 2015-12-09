package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesGetChatsMethod extends TLMethod<com.payway.telegram.api.tl.schema.messages.TLChats> {

public static final int CLASS_ID = 0x3c6aa187;

protected com.payway.telegram.api.tl.core.TLIntVector id;

public TLMessagesGetChatsMethod (com.payway.telegram.api.tl.core.TLIntVector id) {
this.id = id;
}

public com.payway.telegram.api.tl.schema.messages.TLChats deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.messages.TLChats) {return (com.payway.telegram.api.tl.schema.messages.TLChats)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.messages.TLChats, got: " + res.getClass().getCanonicalName()); }
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
return "messages.getChats#3c6aa187";
}
}
