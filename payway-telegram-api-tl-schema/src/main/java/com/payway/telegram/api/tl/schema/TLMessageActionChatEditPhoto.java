package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessageActionChatEditPhoto extends TLAbstractMessageAction { 

public static final int CLASS_ID = 0x7fcb13a8;

protected com.payway.telegram.api.tl.schema.TLAbstractPhoto photo;

public TLMessageActionChatEditPhoto() {}

public TLMessageActionChatEditPhoto (com.payway.telegram.api.tl.schema.TLAbstractPhoto photo) {
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
return "messageActionChatEditPhoto#7fcb13a8";
}
}