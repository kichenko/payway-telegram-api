package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateReadMessages extends TLAbstractUpdate { 

public static final int CLASS_ID = -966484431;

protected com.payway.telegram.api.tl.core.TLIntVector messages;
protected int pts;

public TLUpdateReadMessages() {}

public TLUpdateReadMessages (com.payway.telegram.api.tl.core.TLIntVector messages, int pts) {
this.messages = messages;
this.pts = pts;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.core.TLIntVector getMessages() {
return messages;
}

public void setMessages(com.payway.telegram.api.tl.core.TLIntVector value) {
this.messages = value;
}

public int getPts() {
return pts;
}

public void setPts(int value) {
this.pts = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.messages, stream);
writeInt(this.pts, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.messages = readTLIntVector(stream, context);
this.pts = readInt(stream);
}

@Override
public String toString() {
return "updateReadMessages#-966484431";
}
}