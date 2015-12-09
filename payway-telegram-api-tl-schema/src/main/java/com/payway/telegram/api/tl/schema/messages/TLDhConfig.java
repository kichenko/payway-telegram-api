package com.payway.telegram.api.tl.schema.messages;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLDhConfig extends TLAbstractDhConfig { 

public static final int CLASS_ID = 0x2c221edd;

protected int g;
protected TLBytes p;
protected int version;

public TLDhConfig() {}

public TLDhConfig (int g, TLBytes p, int version, TLBytes random) {
this.g = g;
this.p = p;
this.version = version;
this.random = random;
}

public int getClassId() {
return CLASS_ID;
}
public int getG() {
return g;
}

public void setG(int value) {
this.g = value;
}

public TLBytes getP() {
return p;
}

public void setP(TLBytes value) {
this.p = value;
}

public int getVersion() {
return version;
}

public void setVersion(int value) {
this.version = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.g, stream);
writeTLBytes(this.p, stream);
writeInt(this.version, stream);
writeTLBytes(this.random, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.g = readInt(stream);
this.p = readTLBytes(stream, context);
this.version = readInt(stream);
this.random = readTLBytes(stream, context);
}

@Override
public String toString() {
return "messages.dhConfig#2c221edd";
}
}