package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLWallPaper extends TLAbstractWallPaper { 

public static final int CLASS_ID = 0xccb03657;


public TLWallPaper() {}

public TLWallPaper (int id, String title, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractPhotoSize> sizes, int color) {
this.id = id;
this.title = title;
this.sizes = sizes;
this.color = color;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.id, stream);
writeTLString(this.title, stream);
writeTLVector(this.sizes, stream);
writeInt(this.color, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readInt(stream);
this.title = readTLString(stream);
this.sizes = readTLVector(stream, context);
this.color = readInt(stream);
}

@Override
public String toString() {
return "wallPaper#ccb03657";
}
}