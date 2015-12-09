package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLChatForbidden extends TLAbstractChat { 

public static final int CLASS_ID = 0xfb0ccc41;

protected String title;
protected int date;

public TLChatForbidden() {}

public TLChatForbidden (int id, String title, int date) {
this.id = id;
this.title = title;
this.date = date;
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

public int getDate() {
return date;
}

public void setDate(int value) {
this.date = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.id, stream);
writeTLString(this.title, stream);
writeInt(this.date, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readInt(stream);
this.title = readTLString(stream);
this.date = readInt(stream);
}

@Override
public String toString() {
return "chatForbidden#fb0ccc41";
}
}