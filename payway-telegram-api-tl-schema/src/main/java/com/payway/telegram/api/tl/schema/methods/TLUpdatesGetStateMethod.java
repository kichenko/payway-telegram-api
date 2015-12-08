package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdatesGetStateMethod extends TLMethod<com.payway.telegram.api.tl.schema.updates.TLState> {

public static final int CLASS_ID = -304838614;


public TLUpdatesGetStateMethod () {
}

public com.payway.telegram.api.tl.schema.updates.TLState deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.updates.TLState) {return (com.payway.telegram.api.tl.schema.updates.TLState)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.updates.TLState, got: " + res.getClass().getCanonicalName()); }
}


public int getClassId() {
return CLASS_ID;
}


@Override
public String toString() {
return "updates.getState#-304838614";
}
}
