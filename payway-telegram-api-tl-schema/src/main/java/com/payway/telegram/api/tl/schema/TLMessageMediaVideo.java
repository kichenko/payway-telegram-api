package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessageMediaVideo extends TLAbstractMessageMedia { 

public static final int CLASS_ID = 0xa2d24290;

protected com.payway.telegram.api.tl.schema.TLAbstractVideo video;

public TLMessageMediaVideo() {}

public TLMessageMediaVideo (com.payway.telegram.api.tl.schema.TLAbstractVideo video) {
this.video = video;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractVideo getVideo() {
return video;
}

public void setVideo(com.payway.telegram.api.tl.schema.TLAbstractVideo value) {
this.video = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.video, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.video = (com.payway.telegram.api.tl.schema.TLAbstractVideo)readTLObject(stream, context);
}

@Override
public String toString() {
return "messageMediaVideo#a2d24290";
}
}