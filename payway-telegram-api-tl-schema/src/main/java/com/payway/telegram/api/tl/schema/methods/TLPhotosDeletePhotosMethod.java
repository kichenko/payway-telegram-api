package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPhotosDeletePhotosMethod extends TLMethod<com.payway.telegram.api.tl.core.TLLongVector> {

public static final int CLASS_ID = 0x87cf7f2f;

protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputPhoto> id;

public TLPhotosDeletePhotosMethod (com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputPhoto> id) {
this.id = id;
}

public com.payway.telegram.api.tl.core.TLLongVector deserializeResponse(InputStream stream, TLContext context) throws IOException {
return readTLLongVector(stream, context);
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputPhoto> getId() {
return id;
}

public void setId(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputPhoto> value) {
this.id = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.id, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readTLVector(stream, context);
}

@Override
public String toString() {
return "photos.deletePhotos#87cf7f2f";
}
}
