package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLContactsExportCardMethod extends TLMethod<com.payway.telegram.api.tl.core.TLIntVector> {

public static final int CLASS_ID = 0x84e53737;


public TLContactsExportCardMethod () {
}

public com.payway.telegram.api.tl.core.TLIntVector deserializeResponse(InputStream stream, TLContext context) throws IOException {
return readTLIntVector(stream, context);
}


public int getClassId() {
return CLASS_ID;
}


@Override
public String toString() {
return "contacts.exportCard#84e53737";
}
}
