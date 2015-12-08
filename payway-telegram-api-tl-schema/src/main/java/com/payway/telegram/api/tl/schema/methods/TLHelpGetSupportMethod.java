package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLHelpGetSupportMethod extends TLMethod<com.payway.telegram.api.tl.schema.help.TLSupport> {

public static final int CLASS_ID = -1663104819;


public TLHelpGetSupportMethod () {
}

public com.payway.telegram.api.tl.schema.help.TLSupport deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.help.TLSupport) {return (com.payway.telegram.api.tl.schema.help.TLSupport)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.help.TLSupport, got: " + res.getClass().getCanonicalName()); }
}


public int getClassId() {
return CLASS_ID;
}


@Override
public String toString() {
return "help.getSupport#-1663104819";
}
}
