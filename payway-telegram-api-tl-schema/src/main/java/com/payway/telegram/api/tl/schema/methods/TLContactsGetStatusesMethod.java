package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLContactsGetStatusesMethod extends TLMethod<com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLContactStatus>> {

public static final int CLASS_ID = 0xc4a353ee;


public TLContactsGetStatusesMethod () {
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLContactStatus> deserializeResponse(InputStream stream, TLContext context) throws IOException {
return readTLVector(stream, context);
}


public int getClassId() {
return CLASS_ID;
}


@Override
public String toString() {
return "contacts.getStatuses#c4a353ee";
}
}
