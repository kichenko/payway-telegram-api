package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesGetDialogsMethod extends TLMethod<com.payway.telegram.api.tl.schema.messages.TLAbstractDialogs> {

public static final int CLASS_ID = -321970698;

protected int offset;
protected int maxId;
protected int limit;

public TLMessagesGetDialogsMethod (int offset, int maxId, int limit) {
this.offset = offset;
this.maxId = maxId;
this.limit = limit;
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractDialogs deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.messages.TLAbstractDialogs) {return (com.payway.telegram.api.tl.schema.messages.TLAbstractDialogs)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.messages.TLAbstractDialogs, got: " + res.getClass().getCanonicalName()); }
}

public int getOffset() {
return offset;
}

public void setOffset(int value) {
this.offset = value;
}

public int getMaxId() {
return maxId;
}

public void setMaxId(int value) {
this.maxId = value;
}

public int getLimit() {
return limit;
}

public void setLimit(int value) {
this.limit = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.offset, stream);
writeInt(this.maxId, stream);
writeInt(this.limit, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.offset = readInt(stream);
this.maxId = readInt(stream);
this.limit = readInt(stream);
}

@Override
public String toString() {
return "messages.getDialogs#-321970698";
}
}
