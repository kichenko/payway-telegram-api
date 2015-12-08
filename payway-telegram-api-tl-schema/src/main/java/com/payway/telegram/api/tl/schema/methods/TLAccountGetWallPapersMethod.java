package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAccountGetWallPapersMethod extends TLMethod<com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractWallPaper>> {

public static final int CLASS_ID = -1068696894;


public TLAccountGetWallPapersMethod () {
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractWallPaper> deserializeResponse(InputStream stream, TLContext context) throws IOException {
return readTLVector(stream, context);
}


public int getClassId() {
return CLASS_ID;
}


@Override
public String toString() {
return "account.getWallPapers#-1068696894";
}
}
