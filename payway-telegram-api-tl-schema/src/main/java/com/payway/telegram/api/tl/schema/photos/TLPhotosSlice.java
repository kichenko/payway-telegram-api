package com.payway.telegram.api.tl.schema.photos;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPhotosSlice extends TLAbstractPhotos { 

public static final int CLASS_ID = 352657236;

protected int count;

public TLPhotosSlice() {}

public TLPhotosSlice (int count, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractPhoto> photos, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users) {
this.count = count;
this.photos = photos;
this.users = users;
}

public int getClassId() {
return CLASS_ID;
}
public int getCount() {
return count;
}

public void setCount(int value) {
this.count = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.count, stream);
writeTLVector(this.photos, stream);
writeTLVector(this.users, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.count = readInt(stream);
this.photos = readTLVector(stream, context);
this.users = readTLVector(stream, context);
}

@Override
public String toString() {
return "photos.photosSlice#352657236";
}
}