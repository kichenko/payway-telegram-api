package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMediaUploadedPhoto extends TLAbstractInputMedia { 

public static final int CLASS_ID = 0x2dc53a7d;

protected com.payway.telegram.api.tl.schema.TLAbstractInputFile file;

public TLInputMediaUploadedPhoto() {}

public TLInputMediaUploadedPhoto (com.payway.telegram.api.tl.schema.TLAbstractInputFile file) {
this.file = file;
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


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.file, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.file = (com.payway.telegram.api.tl.schema.TLAbstractInputFile)readTLObject(stream, context);
}

@Override
public String toString() {
return "inputMediaUploadedPhoto#2dc53a7d";
}
}