package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputChatPhoto extends TLAbstractInputChatPhoto { 

public static final int CLASS_ID = -1293828344;

protected com.payway.telegram.api.tl.schema.TLAbstractInputPhoto id;
protected com.payway.telegram.api.tl.schema.TLAbstractInputPhotoCrop crop;

public TLInputChatPhoto() {}

public TLInputChatPhoto (com.payway.telegram.api.tl.schema.TLAbstractInputPhoto id, com.payway.telegram.api.tl.schema.TLAbstractInputPhotoCrop crop) {
this.id = id;
this.crop = crop;
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

public com.payway.telegram.api.tl.schema.TLAbstractInputPhotoCrop getCrop() {
return crop;
}

public void setCrop(com.payway.telegram.api.tl.schema.TLAbstractInputPhotoCrop value) {
this.crop = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.id, stream);
writeTLObject(this.crop, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = (com.payway.telegram.api.tl.schema.TLAbstractInputPhoto)readTLObject(stream, context);
this.crop = (com.payway.telegram.api.tl.schema.TLAbstractInputPhotoCrop)readTLObject(stream, context);
}

@Override
public String toString() {
return "inputChatPhoto#-1293828344";
}
}