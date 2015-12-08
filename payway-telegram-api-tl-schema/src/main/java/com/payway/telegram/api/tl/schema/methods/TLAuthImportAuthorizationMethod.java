package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAuthImportAuthorizationMethod extends TLMethod<com.payway.telegram.api.tl.schema.auth.TLAuthorization> {

public static final int CLASS_ID = -470837741;

protected int id;
protected TLBytes bytes;

public TLAuthImportAuthorizationMethod (int id, TLBytes bytes) {
this.id = id;
this.bytes = bytes;
}

public com.payway.telegram.api.tl.schema.auth.TLAuthorization deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.auth.TLAuthorization) {return (com.payway.telegram.api.tl.schema.auth.TLAuthorization)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.auth.TLAuthorization, got: " + res.getClass().getCanonicalName()); }
}

public int getId() {
return id;
}

public void setId(int value) {
this.id = value;
}

public TLBytes getBytes() {
return bytes;
}

public void setBytes(TLBytes value) {
this.bytes = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.id, stream);
writeTLBytes(this.bytes, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readInt(stream);
this.bytes = readTLBytes(stream, context);
}

@Override
public String toString() {
return "auth.importAuthorization#-470837741";
}
}
