package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLChatPhoto extends TLAbstractChatPhoto { 

public static final int CLASS_ID = 1632839530;

protected com.payway.telegram.api.tl.schema.TLAbstractFileLocation photoSmall;
protected com.payway.telegram.api.tl.schema.TLAbstractFileLocation photoBig;

public TLChatPhoto() {}

public TLChatPhoto (com.payway.telegram.api.tl.schema.TLAbstractFileLocation photoSmall, com.payway.telegram.api.tl.schema.TLAbstractFileLocation photoBig) {
this.photoSmall = photoSmall;
this.photoBig = photoBig;
}

public int getClassId() {
return CLASS_ID;
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
writeTLObject(this.photoSmall, stream);
writeTLObject(this.photoBig, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.photoSmall = (com.payway.telegram.api.tl.schema.TLAbstractFileLocation)readTLObject(stream, context);
this.photoBig = (com.payway.telegram.api.tl.schema.TLAbstractFileLocation)readTLObject(stream, context);
}

@Override
public String toString() {
return "chatPhoto#1632839530";
}
}