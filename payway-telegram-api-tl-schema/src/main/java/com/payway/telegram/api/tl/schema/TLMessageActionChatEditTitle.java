package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessageActionChatEditTitle extends TLAbstractMessageAction { 

public static final int CLASS_ID = -1247687078;

protected String title;

public TLMessageActionChatEditTitle() {}

public TLMessageActionChatEditTitle (String title) {
this.title = title;
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


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.title, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.title = readTLString(stream);
}

@Override
public String toString() {
return "messageActionChatEditTitle#-1247687078";
}
}