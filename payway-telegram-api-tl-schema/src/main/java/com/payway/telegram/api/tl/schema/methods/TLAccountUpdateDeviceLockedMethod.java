package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAccountUpdateDeviceLockedMethod extends TLMethod<com.payway.telegram.api.tl.core.TLBool> {

public static final int CLASS_ID = 0x38df3532;

protected int period;

public TLAccountUpdateDeviceLockedMethod (int period) {
this.period = period;
}

public com.payway.telegram.api.tl.core.TLBool deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.core.TLBool) {return (com.payway.telegram.api.tl.core.TLBool)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.core.TLBool, got: " + res.getClass().getCanonicalName()); }
}

public int getPeriod() {
return period;
}

public void setPeriod(int value) {
this.period = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.period, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.period = readInt(stream);
}

@Override
public String toString() {
return "account.updateDeviceLocked#38df3532";
}
}
