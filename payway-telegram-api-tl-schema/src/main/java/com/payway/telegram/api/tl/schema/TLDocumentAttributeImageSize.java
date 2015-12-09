package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLDocumentAttributeImageSize extends TLAbstractDocumentAttribute { 

public static final int CLASS_ID = 0x6c37c15c;


public TLDocumentAttributeImageSize() {}

public TLDocumentAttributeImageSize (int w, int h) {
this.w = w;
this.h = h;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.w, stream);
writeInt(this.h, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.w = readInt(stream);
this.h = readInt(stream);
}

@Override
public String toString() {
return "documentAttributeImageSize#6c37c15c";
}
}