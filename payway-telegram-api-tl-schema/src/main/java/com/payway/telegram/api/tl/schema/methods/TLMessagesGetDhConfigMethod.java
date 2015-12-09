package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesGetDhConfigMethod extends TLMethod<com.payway.telegram.api.tl.schema.messages.TLAbstractDhConfig> {

public static final int CLASS_ID = 0x26cf8950;

protected int version;
protected int randomLength;

public TLMessagesGetDhConfigMethod (int version, int randomLength) {
this.version = version;
this.randomLength = randomLength;
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractDhConfig deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.messages.TLAbstractDhConfig) {return (com.payway.telegram.api.tl.schema.messages.TLAbstractDhConfig)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.messages.TLAbstractDhConfig, got: " + res.getClass().getCanonicalName()); }
}

public int getVersion() {
return version;
}

public void setVersion(int value) {
this.version = value;
}

public int getRandomLength() {
return randomLength;
}

public void setRandomLength(int value) {
this.randomLength = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.version, stream);
writeInt(this.randomLength, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.version = readInt(stream);
this.randomLength = readInt(stream);
}

@Override
public String toString() {
return "messages.getDhConfig#26cf8950";
}
}
