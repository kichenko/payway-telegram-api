package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPhotosUpdateProfilePhotoMethod extends TLMethod<com.payway.telegram.api.tl.schema.TLAbstractUserProfilePhoto> {

public static final int CLASS_ID = 0xeef579a0;

protected com.payway.telegram.api.tl.schema.TLAbstractInputPhoto id;
protected com.payway.telegram.api.tl.schema.TLAbstractInputPhotoCrop crop;

public TLPhotosUpdateProfilePhotoMethod (com.payway.telegram.api.tl.schema.TLAbstractInputPhoto id, com.payway.telegram.api.tl.schema.TLAbstractInputPhotoCrop crop) {
this.id = id;
this.crop = crop;
}

public com.payway.telegram.api.tl.schema.TLAbstractUserProfilePhoto deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.TLAbstractUserProfilePhoto) {return (com.payway.telegram.api.tl.schema.TLAbstractUserProfilePhoto)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.TLAbstractUserProfilePhoto, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.schema.TLAbstractInputPhoto getId() {
return id;
}

public void setId(com.payway.telegram.api.tl.schema.TLAbstractInputPhoto value) {
this.id = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractInputPhotoCrop getCrop() {
return crop;
}

public void setCrop(com.payway.telegram.api.tl.schema.TLAbstractInputPhotoCrop value) {
this.crop = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.id, stream);
writeTLObject(this.crop, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = (com.payway.telegram.api.tl.schema.TLAbstractInputPhoto)readTLObject(stream, context);
this.crop = (com.payway.telegram.api.tl.schema.TLAbstractInputPhotoCrop)readTLObject(stream, context);
}

@Override
public String toString() {
return "photos.updateProfilePhoto#eef579a0";
}
}
