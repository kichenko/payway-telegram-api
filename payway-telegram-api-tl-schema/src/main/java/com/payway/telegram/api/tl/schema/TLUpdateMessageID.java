package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateMessageID extends TLAbstractUpdate { 

public static final int CLASS_ID = 1318109142;

protected int id;
protected long randomId;

public TLUpdateMessageID() {}

public TLUpdateMessageID (int id, long randomId) {
this.id = id;
this.randomId = randomId;
}

public int getClassId() {
return CLASS_ID;
}
public int getId() {
return id;
}

public void setId(int value) {
this.id = value;
}

public long getRandomId() {
return randomId;
}

public void setRandomId(long value) {
this.randomId = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.id, stream);
writeLong(this.randomId, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readInt(stream);
this.randomId = readLong(stream);
}

@Override
public String toString() {
return "updateMessageID#1318109142";
}
}