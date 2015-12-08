package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateNewMessage extends TLAbstractUpdate { 

public static final int CLASS_ID = 20626867;

protected com.payway.telegram.api.tl.schema.TLAbstractMessage message;
protected int pts;

public TLUpdateNewMessage() {}

public TLUpdateNewMessage (com.payway.telegram.api.tl.schema.TLAbstractMessage message, int pts) {
this.message = message;
this.pts = pts;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractMessage getMessage() {
return message;
}

public void setMessage(com.payway.telegram.api.tl.schema.TLAbstractMessage value) {
this.message = value;
}

public int getPts() {
return pts;
}

public void setPts(int value) {
this.pts = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.message, stream);
writeInt(this.pts, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.message = (com.payway.telegram.api.tl.schema.TLAbstractMessage)readTLObject(stream, context);
this.pts = readInt(stream);
}

@Override
public String toString() {
return "updateNewMessage#20626867";
}
}