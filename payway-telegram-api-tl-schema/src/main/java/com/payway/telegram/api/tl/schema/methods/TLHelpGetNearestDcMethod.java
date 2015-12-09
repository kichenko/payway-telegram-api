package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLHelpGetNearestDcMethod extends TLMethod<com.payway.telegram.api.tl.schema.TLNearestDc> {

public static final int CLASS_ID = 0x1fb33026;


public TLHelpGetNearestDcMethod () {
}

public com.payway.telegram.api.tl.schema.TLNearestDc deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.TLNearestDc) {return (com.payway.telegram.api.tl.schema.TLNearestDc)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.TLNearestDc, got: " + res.getClass().getCanonicalName()); }
}


public int getClassId() {
return CLASS_ID;
}


@Override
public String toString() {
return "help.getNearestDc#1fb33026";
}
}
