package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesReceivedQueueMethod extends TLMethod<com.payway.telegram.api.tl.core.TLLongVector> {

public static final int CLASS_ID = 0x55a5bb66;

protected int maxQts;

public TLMessagesReceivedQueueMethod (int maxQts) {
this.maxQts = maxQts;
}

public com.payway.telegram.api.tl.core.TLLongVector deserializeResponse(InputStream stream, TLContext context) throws IOException {
return readTLLongVector(stream, context);
}

public int getMaxQts() {
return maxQts;
}

public void setMaxQts(int value) {
this.maxQts = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.maxQts, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.maxQts = readInt(stream);
}

@Override
public String toString() {
return "messages.receivedQueue#55a5bb66";
}
}
