package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUserProfilePhoto extends TLAbstractUserProfilePhoto { 

public static final int CLASS_ID = 0xd559d8c8;

protected long photoId;
protected com.payway.telegram.api.tl.schema.TLAbstractFileLocation photoSmall;
protected com.payway.telegram.api.tl.schema.TLAbstractFileLocation photoBig;

public TLUserProfilePhoto() {}

public TLUserProfilePhoto (long photoId, com.payway.telegram.api.tl.schema.TLAbstractFileLocation photoSmall, com.payway.telegram.api.tl.schema.TLAbstractFileLocation photoBig) {
this.photoId = photoId;
this.photoSmall = photoSmall;
this.photoBig = photoBig;
}

public int getClassId() {
return CLASS_ID;
}
public long getPhotoId() {
return photoId;
}

public void setPhotoId(long value) {
this.photoId = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractFileLocation getPhotoSmall() {
return photoSmall;
}

public void setPhotoSmall(com.payway.telegram.api.tl.schema.TLAbstractFileLocation value) {
this.photoSmall = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractFileLocation getPhotoBig() {
return photoBig;
}

public void setPhotoBig(com.payway.telegram.api.tl.schema.TLAbstractFileLocation value) {
this.photoBig = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeLong(this.photoId, stream);
writeTLObject(this.photoSmall, stream);
writeTLObject(this.photoBig, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.photoId = readLong(stream);
this.photoSmall = (com.payway.telegram.api.tl.schema.TLAbstractFileLocation)readTLObject(stream, context);
this.photoBig = (com.payway.telegram.api.tl.schema.TLAbstractFileLocation)readTLObject(stream, context);
}

@Override
public String toString() {
return "userProfilePhoto#d559d8c8";
}
}