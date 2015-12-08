package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateUserTyping extends TLAbstractUpdate { 

public static final int CLASS_ID = 1548249383;

protected int userId;
protected com.payway.telegram.api.tl.schema.TLAbstractSendMessageAction action;

public TLUpdateUserTyping() {}

public TLUpdateUserTyping (int userId, com.payway.telegram.api.tl.schema.TLAbstractSendMessageAction action) {
this.userId = userId;
this.action = action;
}

public int getClassId() {
return CLASS_ID;
}
public int getUserId() {
return userId;
}

public void setUserId(int value) {
this.userId = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractSendMessageAction getAction() {
return action;
}

public void setAction(com.payway.telegram.api.tl.schema.TLAbstractSendMessageAction value) {
this.action = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.userId, stream);
writeTLObject(this.action, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.userId = readInt(stream);
this.action = (com.payway.telegram.api.tl.schema.TLAbstractSendMessageAction)readTLObject(stream, context);
}

@Override
public String toString() {
return "updateUserTyping#1548249383";
}
}