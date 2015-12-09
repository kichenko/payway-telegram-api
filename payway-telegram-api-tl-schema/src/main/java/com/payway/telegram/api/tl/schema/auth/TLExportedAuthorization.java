package com.payway.telegram.api.tl.schema.auth;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLExportedAuthorization extends TLObject {

public static final int CLASS_ID = 0xdf969c2d;

protected int id;
protected TLBytes bytes;

public TLExportedAuthorization() {}

public TLExportedAuthorization (int id, TLBytes bytes) {
this.id = id;
this.bytes = bytes;
}

public int getClassId() {
return CLASS_ID;
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
return "auth.exportedAuthorization#df969c2d";
}
}
