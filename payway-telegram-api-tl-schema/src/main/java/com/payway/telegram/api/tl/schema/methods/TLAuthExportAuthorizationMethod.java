package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAuthExportAuthorizationMethod extends TLMethod<com.payway.telegram.api.tl.schema.auth.TLExportedAuthorization> {

public static final int CLASS_ID = 0xe5bfffcd;

protected int dcId;

public TLAuthExportAuthorizationMethod (int dcId) {
this.dcId = dcId;
}

public com.payway.telegram.api.tl.schema.auth.TLExportedAuthorization deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.auth.TLExportedAuthorization) {return (com.payway.telegram.api.tl.schema.auth.TLExportedAuthorization)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.auth.TLExportedAuthorization, got: " + res.getClass().getCanonicalName()); }
}

public int getDcId() {
return dcId;
}

public void setDcId(int value) {
this.dcId = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.dcId, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.dcId = readInt(stream);
}

@Override
public String toString() {
return "auth.exportAuthorization#e5bfffcd";
}
}
