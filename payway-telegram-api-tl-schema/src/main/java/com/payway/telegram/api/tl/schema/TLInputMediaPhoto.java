package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMediaPhoto extends TLAbstractInputMedia { 

public static final int CLASS_ID = 0x8f2ab2ec;

protected com.payway.telegram.api.tl.schema.TLAbstractInputPhoto id;

public TLInputMediaPhoto() {}

public TLInputMediaPhoto (com.payway.telegram.api.tl.schema.TLAbstractInputPhoto id) {
this.id = id;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractInputPhoto getId() {
return id;
}

public void setId(com.payway.telegram.api.tl.schema.TLAbstractInputPhoto value) {
this.id = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.id, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = (com.payway.telegram.api.tl.schema.TLAbstractInputPhoto)readTLObject(stream, context);
}

@Override
public String toString() {
return "inputMediaPhoto#8f2ab2ec";
}
}