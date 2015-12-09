package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInvokeWithLayerMethod extends TLMethod<TLObject> {

public static final int CLASS_ID = 0xda9b0d0d;

protected int layer;
protected TLMethod query;

public TLInvokeWithLayerMethod (int layer, TLMethod query) {
this.layer = layer;
this.query = query;
}

public TLObject deserializeResponse(InputStream stream, TLContext context) throws IOException {
return (TLObject) query.deserializeResponse(stream, context);
}

public int getLayer() {
return layer;
}

public void setLayer(int value) {
this.layer = value;
}

public TLMethod getQuery() {
return query;
}

public void setQuery(TLMethod value) {
this.query = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.layer, stream);
writeTLMethod(this.query, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.layer = readInt(stream);
this.query = readTLMethod(stream, context);
}

@Override
public String toString() {
return "invokeWithLayer#da9b0d0d";
}
}
