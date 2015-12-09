package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPhotoSize extends TLAbstractPhotoSize { 

public static final int CLASS_ID = 0x77bfb61b;

protected com.payway.telegram.api.tl.schema.TLAbstractFileLocation location;
protected int w;
protected int h;
protected int size;

public TLPhotoSize() {}

public TLPhotoSize (String type, com.payway.telegram.api.tl.schema.TLAbstractFileLocation location, int w, int h, int size) {
this.type = type;
this.location = location;
this.w = w;
this.h = h;
this.size = size;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractFileLocation getLocation() {
return location;
}

public void setLocation(com.payway.telegram.api.tl.schema.TLAbstractFileLocation value) {
this.location = value;
}

public int getW() {
return w;
}

public void setW(int value) {
this.w = value;
}

public int getH() {
return h;
}

public void setH(int value) {
this.h = value;
}

public int getSize() {
return size;
}

public void setSize(int value) {
this.size = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.type, stream);
writeTLObject(this.location, stream);
writeInt(this.w, stream);
writeInt(this.h, stream);
writeInt(this.size, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.type = readTLString(stream);
this.location = (com.payway.telegram.api.tl.schema.TLAbstractFileLocation)readTLObject(stream, context);
this.w = readInt(stream);
this.h = readInt(stream);
this.size = readInt(stream);
}

@Override
public String toString() {
return "photoSize#77bfb61b";
}
}