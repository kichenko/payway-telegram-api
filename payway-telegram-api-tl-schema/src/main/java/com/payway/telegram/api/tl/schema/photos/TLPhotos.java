package com.payway.telegram.api.tl.schema.photos;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPhotos extends TLAbstractPhotos { 

public static final int CLASS_ID = -1916114267;


public TLPhotos() {}

public TLPhotos (com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractPhoto> photos, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users) {
this.photos = photos;
this.users = users;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.photos, stream);
writeTLVector(this.users, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.photos = readTLVector(stream, context);
this.users = readTLVector(stream, context);
}

@Override
public String toString() {
return "photos.photos#-1916114267";
}
}