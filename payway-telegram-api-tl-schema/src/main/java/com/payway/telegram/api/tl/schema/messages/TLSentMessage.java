package com.payway.telegram.api.tl.schema.messages;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLSentMessage extends TLAbstractSentMessage { 

public static final int CLASS_ID = 0xd1f4d35c;


public TLSentMessage() {}

public TLSentMessage (int id, int date, int pts, int seq) {
this.id = id;
this.date = date;
this.pts = pts;
this.seq = seq;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.id, stream);
writeInt(this.date, stream);
writeInt(this.pts, stream);
writeInt(this.seq, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readInt(stream);
this.date = readInt(stream);
this.pts = readInt(stream);
this.seq = readInt(stream);
}

@Override
public String toString() {
return "messages.sentMessage#d1f4d35c";
}
}