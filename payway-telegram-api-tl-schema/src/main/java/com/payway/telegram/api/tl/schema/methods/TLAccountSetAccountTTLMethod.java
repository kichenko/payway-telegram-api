package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAccountSetAccountTTLMethod extends TLMethod<com.payway.telegram.api.tl.core.TLBool> {

public static final int CLASS_ID = 0x2442485e;

protected com.payway.telegram.api.tl.schema.TLAccountDaysTTL ttl;

public TLAccountSetAccountTTLMethod (com.payway.telegram.api.tl.schema.TLAccountDaysTTL ttl) {
this.ttl = ttl;
}

public com.payway.telegram.api.tl.core.TLBool deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.core.TLBool) {return (com.payway.telegram.api.tl.core.TLBool)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.core.TLBool, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.schema.TLAccountDaysTTL getTtl() {
return ttl;
}

public void setTtl(com.payway.telegram.api.tl.schema.TLAccountDaysTTL value) {
this.ttl = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.ttl, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.ttl = (com.payway.telegram.api.tl.schema.TLAccountDaysTTL)readTLObject(stream, context);
}

@Override
public String toString() {
return "account.setAccountTTL#2442485e";
}
}
