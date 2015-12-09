package com.payway.telegram.api.tl.schema.messages;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLDhConfigNotModified extends TLAbstractDhConfig { 

public static final int CLASS_ID = 0xc0e24635;


public TLDhConfigNotModified() {}

public TLDhConfigNotModified (TLBytes random) {
this.random = random;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLBytes(this.random, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.random = readTLBytes(stream, context);
}

@Override
public String toString() {
return "messages.dhConfigNotModified#c0e24635";
}
}