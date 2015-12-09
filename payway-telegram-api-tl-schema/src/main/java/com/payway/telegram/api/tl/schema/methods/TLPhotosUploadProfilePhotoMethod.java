package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPhotosUploadProfilePhotoMethod extends TLMethod<com.payway.telegram.api.tl.schema.photos.TLPhoto> {

public static final int CLASS_ID = 0xd50f9c88;

protected com.payway.telegram.api.tl.schema.TLAbstractInputFile file;
protected String caption;
protected com.payway.telegram.api.tl.schema.TLAbstractInputGeoPoint geoPoint;
protected com.payway.telegram.api.tl.schema.TLAbstractInputPhotoCrop crop;

public TLPhotosUploadProfilePhotoMethod (com.payway.telegram.api.tl.schema.TLAbstractInputFile file, String caption, com.payway.telegram.api.tl.schema.TLAbstractInputGeoPoint geoPoint, com.payway.telegram.api.tl.schema.TLAbstractInputPhotoCrop crop) {
this.file = file;
this.caption = caption;
this.geoPoint = geoPoint;
this.crop = crop;
}

public com.payway.telegram.api.tl.schema.photos.TLPhoto deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.photos.TLPhoto) {return (com.payway.telegram.api.tl.schema.photos.TLPhoto)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.photos.TLPhoto, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.schema.TLAbstractInputFile getFile() {
return file;
}

public void setFile(com.payway.telegram.api.tl.schema.TLAbstractInputFile value) {
this.file = value;
}

public String getCaption() {
return caption;
}

public void setCaption(String value) {
this.caption = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractInputGeoPoint getGeoPoint() {
return geoPoint;
}

public void setGeoPoint(com.payway.telegram.api.tl.schema.TLAbstractInputGeoPoint value) {
this.geoPoint = value;
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
writeTLObject(this.file, stream);
writeTLString(this.caption, stream);
writeTLObject(this.geoPoint, stream);
writeTLObject(this.crop, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.file = (com.payway.telegram.api.tl.schema.TLAbstractInputFile)readTLObject(stream, context);
this.caption = readTLString(stream);
this.geoPoint = (com.payway.telegram.api.tl.schema.TLAbstractInputGeoPoint)readTLObject(stream, context);
this.crop = (com.payway.telegram.api.tl.schema.TLAbstractInputPhotoCrop)readTLObject(stream, context);
}

@Override
public String toString() {
return "photos.uploadProfilePhoto#d50f9c88";
}
}
