package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdatesGetDifferenceMethod extends TLMethod<com.payway.telegram.api.tl.schema.updates.TLAbstractDifference> {

public static final int CLASS_ID = 0xa041495;

protected int pts;
protected int date;
protected int qts;

public TLUpdatesGetDifferenceMethod (int pts, int date, int qts) {
this.pts = pts;
this.date = date;
this.qts = qts;
}

public com.payway.telegram.api.tl.schema.updates.TLAbstractDifference deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.updates.TLAbstractDifference) {return (com.payway.telegram.api.tl.schema.updates.TLAbstractDifference)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.updates.TLAbstractDifference, got: " + res.getClass().getCanonicalName()); }
}

public int getPts() {
return pts;
}

public void setPts(int value) {
this.pts = value;
}

public int getDate() {
return date;
}

public void setDate(int value) {
this.date = value;
}

public int getQts() {
return qts;
}

public void setQts(int value) {
this.qts = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.pts, stream);
writeInt(this.date, stream);
writeInt(this.qts, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.pts = readInt(stream);
this.date = readInt(stream);
this.qts = readInt(stream);
}

@Override
public String toString() {
return "updates.getDifference#a041495";
}
}
