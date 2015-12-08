package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessageMediaDocument extends TLAbstractMessageMedia { 

public static final int CLASS_ID = 802824708;

protected com.payway.telegram.api.tl.schema.TLAbstractDocument document;

public TLMessageMediaDocument() {}

public TLMessageMediaDocument (com.payway.telegram.api.tl.schema.TLAbstractDocument document) {
this.document = document;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractDocument getDocument() {
return document;
}

public void setDocument(com.payway.telegram.api.tl.schema.TLAbstractDocument value) {
this.document = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.document, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.document = (com.payway.telegram.api.tl.schema.TLAbstractDocument)readTLObject(stream, context);
}

@Override
public String toString() {
return "messageMediaDocument#802824708";
}
}