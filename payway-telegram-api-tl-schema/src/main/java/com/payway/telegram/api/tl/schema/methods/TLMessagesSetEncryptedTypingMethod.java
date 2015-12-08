package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesSetEncryptedTypingMethod extends TLMethod<com.payway.telegram.api.tl.core.TLBool> {

public static final int CLASS_ID = 2031374829;

protected com.payway.telegram.api.tl.schema.TLInputEncryptedChat peer;
protected boolean typing;

public TLMessagesSetEncryptedTypingMethod (com.payway.telegram.api.tl.schema.TLInputEncryptedChat peer, boolean typing) {
this.peer = peer;
this.typing = typing;
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

public boolean getTyping() {
return typing;
}

public void setTyping(boolean value) {
this.typing = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.peer, stream);
writeTLBool(this.typing, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.peer = (com.payway.telegram.api.tl.schema.TLInputEncryptedChat)readTLObject(stream, context);
this.typing = readTLBool(stream);
}

@Override
public String toString() {
return "messages.setEncryptedTyping#2031374829";
}
}
