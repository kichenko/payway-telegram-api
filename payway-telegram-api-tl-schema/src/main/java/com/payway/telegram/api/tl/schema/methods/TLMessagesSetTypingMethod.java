package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesSetTypingMethod extends TLMethod<com.payway.telegram.api.tl.core.TLBool> {

public static final int CLASS_ID = 0xa3825e50;

protected com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer;
protected com.payway.telegram.api.tl.schema.TLAbstractSendMessageAction action;

public TLMessagesSetTypingMethod (com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer, com.payway.telegram.api.tl.schema.TLAbstractSendMessageAction action) {
this.peer = peer;
this.action = action;
}

public com.payway.telegram.api.tl.core.TLBool deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.core.TLBool) {return (com.payway.telegram.api.tl.core.TLBool)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.core.TLBool, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.schema.TLAbstractInputPeer getPeer() {
return peer;
}

public void setPeer(com.payway.telegram.api.tl.schema.TLAbstractInputPeer value) {
this.peer = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractSendMessageAction getAction() {
return action;
}

public void setAction(com.payway.telegram.api.tl.schema.TLAbstractSendMessageAction value) {
this.action = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.peer, stream);
writeTLObject(this.action, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.peer = (com.payway.telegram.api.tl.schema.TLAbstractInputPeer)readTLObject(stream, context);
this.action = (com.payway.telegram.api.tl.schema.TLAbstractSendMessageAction)readTLObject(stream, context);
}

@Override
public String toString() {
return "messages.setTyping#a3825e50";
}
}
