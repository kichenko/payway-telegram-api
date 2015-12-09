package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAccountGetAccountTTLMethod extends TLMethod<com.payway.telegram.api.tl.schema.TLAccountDaysTTL> {

public static final int CLASS_ID = 0x8fc711d;


public TLAccountGetAccountTTLMethod () {
}

public com.payway.telegram.api.tl.schema.TLAccountDaysTTL deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.TLAccountDaysTTL) {return (com.payway.telegram.api.tl.schema.TLAccountDaysTTL)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.TLAccountDaysTTL, got: " + res.getClass().getCanonicalName()); }
}


public int getClassId() {
return CLASS_ID;
}


@Override
public String toString() {
return "account.getAccountTTL#8fc711d";
}
}
