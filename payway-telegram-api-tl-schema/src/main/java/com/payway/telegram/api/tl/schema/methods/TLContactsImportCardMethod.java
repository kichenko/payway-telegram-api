package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLContactsImportCardMethod extends TLMethod<com.payway.telegram.api.tl.schema.TLAbstractUser> {

public static final int CLASS_ID = 1340184318;

protected com.payway.telegram.api.tl.core.TLIntVector exportCard;

public TLContactsImportCardMethod (com.payway.telegram.api.tl.core.TLIntVector exportCard) {
this.exportCard = exportCard;
}

public com.payway.telegram.api.tl.schema.TLAbstractUser deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.TLAbstractUser) {return (com.payway.telegram.api.tl.schema.TLAbstractUser)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.TLAbstractUser, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.core.TLIntVector getExportCard() {
return exportCard;
}

public void setExportCard(com.payway.telegram.api.tl.core.TLIntVector value) {
this.exportCard = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.exportCard, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.exportCard = readTLIntVector(stream, context);
}

@Override
public String toString() {
return "contacts.importCard#1340184318";
}
}
