package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMediaUploadedVideo extends TLAbstractInputMedia { 

public static final int CLASS_ID = 322623222;

protected com.payway.telegram.api.tl.schema.TLAbstractInputFile file;
protected int duration;
protected int w;
protected int h;
protected String mimeType;

public TLInputMediaUploadedVideo() {}

public TLInputMediaUploadedVideo (com.payway.telegram.api.tl.schema.TLAbstractInputFile file, int duration, int w, int h, String mimeType) {
this.file = file;
this.duration = duration;
this.w = w;
this.h = h;
this.mimeType = mimeType;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractInputFile getFile() {
return file;
}

public void setFile(com.payway.telegram.api.tl.schema.TLAbstractInputFile value) {
this.file = value;
}

public int getDuration() {
return duration;
}

public void setDuration(int value) {
this.duration = value;
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

public String getMimeType() {
return mimeType;
}

public void setMimeType(String value) {
this.mimeType = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.file, stream);
writeInt(this.duration, stream);
writeInt(this.w, stream);
writeInt(this.h, stream);
writeTLString(this.mimeType, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.file = (com.payway.telegram.api.tl.schema.TLAbstractInputFile)readTLObject(stream, context);
this.duration = readInt(stream);
this.w = readInt(stream);
this.h = readInt(stream);
this.mimeType = readTLString(stream);
}

@Override
public String toString() {
return "inputMediaUploadedVideo#322623222";
}
}