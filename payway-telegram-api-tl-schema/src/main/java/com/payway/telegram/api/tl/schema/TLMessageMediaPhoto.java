package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessageMediaPhoto extends TLAbstractMessageMedia { 

public static final int CLASS_ID = 0xc8c45a2a;

protected com.payway.telegram.api.tl.schema.TLAbstractPhoto photo;

public TLMessageMediaPhoto() {}

public TLMessageMediaPhoto (com.payway.telegram.api.tl.schema.TLAbstractPhoto photo) {
this.photo = photo;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractPhoto getPhoto() {
return photo;
}

public void setPhoto(com.payway.telegram.api.tl.schema.TLAbstractPhoto value) {
this.photo = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.photo, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.photo = (com.payway.telegram.api.tl.schema.TLAbstractPhoto)readTLObject(stream, context);
}

@Override
public String toString() {
return "messageMediaPhoto#c8c45a2a";
}
}