package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesReadEncryptedHistoryMethod extends TLMethod<com.payway.telegram.api.tl.core.TLBool> {

public static final int CLASS_ID = 2135648522;

protected com.payway.telegram.api.tl.schema.TLInputEncryptedChat peer;
protected int maxDate;

public TLMessagesReadEncryptedHistoryMethod (com.payway.telegram.api.tl.schema.TLInputEncryptedChat peer, int maxDate) {
this.peer = peer;
this.maxDate = maxDate;
}

public com.payway.telegram.api.tl.core.TLBool deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.core.TLBool) {return (com.payway.telegram.api.tl.core.TLBool)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.core.TLBool, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.schema.TLInputEncryptedChat getPeer() {
return peer;
}

public void setPeer(com.payway.telegram.api.tl.schema.TLInputEncryptedChat value) {
this.peer = value;
}

public int getMaxDate() {
return maxDate;
}

public void setMaxDate(int value) {
this.maxDate = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.peer, stream);
writeInt(this.maxDate, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.peer = (com.payway.telegram.api.tl.schema.TLInputEncryptedChat)readTLObject(stream, context);
this.maxDate = readInt(stream);
}

@Override
public String toString() {
return "messages.readEncryptedHistory#2135648522";
}
}
