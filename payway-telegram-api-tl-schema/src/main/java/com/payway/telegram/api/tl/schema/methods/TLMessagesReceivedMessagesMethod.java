package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesReceivedMessagesMethod extends TLMethod<com.payway.telegram.api.tl.core.TLIntVector> {

public static final int CLASS_ID = 682347368;

protected int maxId;

public TLMessagesReceivedMessagesMethod (int maxId) {
this.maxId = maxId;
}

public com.payway.telegram.api.tl.core.TLIntVector deserializeResponse(InputStream stream, TLContext context) throws IOException {
return readTLIntVector(stream, context);
}

public int getMaxId() {
return maxId;
}

public void setMaxId(int value) {
this.maxId = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.maxId, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.maxId = readInt(stream);
}

@Override
public String toString() {
return "messages.receivedMessages#682347368";
}
}
