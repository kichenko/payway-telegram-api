package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMediaUploadedAudio extends TLAbstractInputMedia { 

public static final int CLASS_ID = 0x4e498cab;

protected com.payway.telegram.api.tl.schema.TLAbstractInputFile file;
protected int duration;
protected String mimeType;

public TLInputMediaUploadedAudio() {}

public TLInputMediaUploadedAudio (com.payway.telegram.api.tl.schema.TLAbstractInputFile file, int duration, String mimeType) {
this.file = file;
this.duration = duration;
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
writeTLString(this.mimeType, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.file = (com.payway.telegram.api.tl.schema.TLAbstractInputFile)readTLObject(stream, context);
this.duration = readInt(stream);
this.mimeType = readTLString(stream);
}

@Override
public String toString() {
return "inputMediaUploadedAudio#4e498cab";
}
}