package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateShort extends TLAbstractUpdates { 

public static final int CLASS_ID = 2027216577;

protected com.payway.telegram.api.tl.schema.TLAbstractUpdate update;
protected int date;

public TLUpdateShort() {}

public TLUpdateShort (com.payway.telegram.api.tl.schema.TLAbstractUpdate update, int date) {
this.update = update;
this.date = date;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractUpdate getUpdate() {
return update;
}

public void setUpdate(com.payway.telegram.api.tl.schema.TLAbstractUpdate value) {
this.update = value;
}

public int getDate() {
return date;
}

public void setDate(int value) {
this.date = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.update, stream);
writeInt(this.date, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.update = (com.payway.telegram.api.tl.schema.TLAbstractUpdate)readTLObject(stream, context);
this.date = readInt(stream);
}

@Override
public String toString() {
return "updateShort#2027216577";
}
}