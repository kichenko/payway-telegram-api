package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLDocumentAttributeVideo extends TLAbstractDocumentAttribute { 

public static final int CLASS_ID = 0x5910cccb;

protected int duration;

public TLDocumentAttributeVideo() {}

public TLDocumentAttributeVideo (int duration, int w, int h) {
this.duration = duration;
this.w = w;
this.h = h;
}

public int getClassId() {
return CLASS_ID;
}
public int getDuration() {
return duration;
}

public void setDuration(int value) {
this.duration = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.duration, stream);
writeInt(this.w, stream);
writeInt(this.h, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.duration = readInt(stream);
this.w = readInt(stream);
this.h = readInt(stream);
}

@Override
public String toString() {
return "documentAttributeVideo#5910cccb";
}
}