package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPhotoSizeEmpty extends TLAbstractPhotoSize { 

public static final int CLASS_ID = 236446268;


public TLPhotoSizeEmpty() {}

public TLPhotoSizeEmpty (String type) {
this.type = type;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.type, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.type = readTLString(stream);
}

@Override
public String toString() {
return "photoSizeEmpty#236446268";
}
}