package com.payway.telegram.api.tl.schema.messages;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAffectedHistory extends TLObject {

public static final int CLASS_ID = -1210173710;

protected int pts;
protected int seq;
protected int offset;

public TLAffectedHistory() {}

public TLAffectedHistory (int pts, int seq, int offset) {
this.pts = pts;
this.seq = seq;
this.offset = offset;
}

public int getClassId() {
return CLASS_ID;
}
public int getPts() {
return pts;
}

public void setPts(int value) {
this.pts = value;
}

public int getSeq() {
return seq;
}

public void setSeq(int value) {
this.seq = value;
}

public int getOffset() {
return offset;
}

public void setOffset(int value) {
this.offset = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.pts, stream);
writeInt(this.seq, stream);
writeInt(this.offset, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.pts = readInt(stream);
this.seq = readInt(stream);
this.offset = readInt(stream);
}

@Override
public String toString() {
return "messages.affectedHistory#-1210173710";
}
}
