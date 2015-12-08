package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessageMediaUnsupported extends TLAbstractMessageMedia { 

public static final int CLASS_ID = 694364726;

protected TLBytes bytes;

public TLMessageMediaUnsupported() {}

public TLMessageMediaUnsupported (TLBytes bytes) {
this.bytes = bytes;
}

public int getClassId() {
return CLASS_ID;
}
public TLBytes getBytes() {
return bytes;
}

public void setBytes(TLBytes value) {
this.bytes = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLBytes(this.bytes, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.bytes = readTLBytes(stream, context);
}

@Override
public String toString() {
return "messageMediaUnsupported#694364726";
}
}