package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputChatUploadedPhoto extends TLAbstractInputChatPhoto { 

public static final int CLASS_ID = 0x94254732;

protected com.payway.telegram.api.tl.schema.TLAbstractInputFile file;
protected com.payway.telegram.api.tl.schema.TLAbstractInputPhotoCrop crop;

public TLInputChatUploadedPhoto() {}

public TLInputChatUploadedPhoto (com.payway.telegram.api.tl.schema.TLAbstractInputFile file, com.payway.telegram.api.tl.schema.TLAbstractInputPhotoCrop crop) {
this.file = file;
this.crop = crop;
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

public com.payway.telegram.api.tl.schema.TLAbstractInputPhotoCrop getCrop() {
return crop;
}

public void setCrop(com.payway.telegram.api.tl.schema.TLAbstractInputPhotoCrop value) {
this.crop = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.file, stream);
writeTLObject(this.crop, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.file = (com.payway.telegram.api.tl.schema.TLAbstractInputFile)readTLObject(stream, context);
this.crop = (com.payway.telegram.api.tl.schema.TLAbstractInputPhotoCrop)readTLObject(stream, context);
}

@Override
public String toString() {
return "inputChatUploadedPhoto#94254732";
}
}