package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessageActionChatCreate extends TLAbstractMessageAction { 

public static final int CLASS_ID = -1503425638;

protected String title;
protected com.payway.telegram.api.tl.core.TLIntVector users;

public TLMessageActionChatCreate() {}

public TLMessageActionChatCreate (String title, com.payway.telegram.api.tl.core.TLIntVector users) {
this.title = title;
this.users = users;
}

public int getClassId() {
return CLASS_ID;
}
public String getTitle() {
return title;
}

public void setTitle(String value) {
this.title = value;
}

public com.payway.telegram.api.tl.core.TLIntVector getUsers() {
return users;
}

public void setUsers(com.payway.telegram.api.tl.core.TLIntVector value) {
this.users = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.title, stream);
writeTLVector(this.users, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.title = readTLString(stream);
this.users = readTLIntVector(stream, context);
}

@Override
public String toString() {
return "messageActionChatCreate#-1503425638";
}
}