package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLHelpGetConfigMethod extends TLMethod<com.payway.telegram.api.tl.schema.TLConfig> {

public static final int CLASS_ID = 0xc4f9186b;


public TLHelpGetConfigMethod () {
}

public com.payway.telegram.api.tl.schema.TLConfig deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.TLConfig) {return (com.payway.telegram.api.tl.schema.TLConfig)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.TLConfig, got: " + res.getClass().getCanonicalName()); }
}


public int getClassId() {
return CLASS_ID;
}


@Override
public String toString() {
return "help.getConfig#c4f9186b";
}
}
