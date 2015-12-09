package com.payway.telegram.api.tl.schema.updates;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLDifferenceEmpty extends TLAbstractDifference { 

public static final int CLASS_ID = 0x5d75a138;


public TLDifferenceEmpty() {}

public TLDifferenceEmpty (int date, int seq) {
this.date = date;
this.seq = seq;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.date, stream);
writeInt(this.seq, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.date = readInt(stream);
this.seq = readInt(stream);
}

@Override
public String toString() {
return "updates.differenceEmpty#5d75a138";
}
}