package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessageActionChatDeleteUser extends TLAbstractMessageAction { 

public static final int CLASS_ID = 0xb2ae9b0c;

protected int userId;

public TLMessageActionChatDeleteUser() {}

public TLMessageActionChatDeleteUser (int userId) {
this.userId = userId;
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


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.userId, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.userId = readInt(stream);
}

@Override
public String toString() {
return "messageActionChatDeleteUser#b2ae9b0c";
}
}