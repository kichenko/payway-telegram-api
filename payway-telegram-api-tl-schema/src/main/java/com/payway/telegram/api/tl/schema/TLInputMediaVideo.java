package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMediaVideo extends TLAbstractInputMedia { 

public static final int CLASS_ID = 0x7f023ae6;

protected com.payway.telegram.api.tl.schema.TLAbstractInputVideo id;

public TLInputMediaVideo() {}

public TLInputMediaVideo (com.payway.telegram.api.tl.schema.TLAbstractInputVideo id) {
this.id = id;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractInputVideo getId() {
return id;
}

public void setId(com.payway.telegram.api.tl.schema.TLAbstractInputVideo value) {
this.id = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.id, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = (com.payway.telegram.api.tl.schema.TLAbstractInputVideo)readTLObject(stream, context);
}

@Override
public String toString() {
return "inputMediaVideo#7f023ae6";
}
}