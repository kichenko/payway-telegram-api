package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateDcOptions extends TLAbstractUpdate { 

public static final int CLASS_ID = -1906403213;

protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLDcOption> dcOptions;

public TLUpdateDcOptions() {}

public TLUpdateDcOptions (com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLDcOption> dcOptions) {
this.dcOptions = dcOptions;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLDcOption> getDcOptions() {
return dcOptions;
}

public void setDcOptions(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLDcOption> value) {
this.dcOptions = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.dcOptions, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.dcOptions = readTLVector(stream, context);
}

@Override
public String toString() {
return "updateDcOptions#-1906403213";
}
}