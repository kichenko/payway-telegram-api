package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLContactStatus extends TLObject {

public static final int CLASS_ID = -1434994573;

protected int userId;
protected int expires;

public TLContactStatus() {}

public TLContactStatus (int userId, int expires) {
this.userId = userId;
this.expires = expires;
}

public int getClassId() {
return CLASS_ID;
}
public int getUserId() {
return userId;
}

public void setUserId(int value) {
this.userId = value;
}

public int getExpires() {
return expires;
}

public void setExpires(int value) {
this.expires = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.userId, stream);
writeInt(this.expires, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.userId = readInt(stream);
this.expires = readInt(stream);
}

@Override
public String toString() {
return "contactStatus#-1434994573";
}
}
