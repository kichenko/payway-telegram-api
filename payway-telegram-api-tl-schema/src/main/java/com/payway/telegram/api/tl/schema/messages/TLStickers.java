package com.payway.telegram.api.tl.schema.messages;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLStickers extends TLAbstractStickers { 

public static final int CLASS_ID = 0x8a8ecd32;

protected String hash;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractDocument> stickers;

public TLStickers() {}

public TLStickers (String hash, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractDocument> stickers) {
this.hash = hash;
this.stickers = stickers;
}

public int getClassId() {
return CLASS_ID;
}
public String getHash() {
return hash;
}

public void setHash(String value) {
this.hash = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractDocument> getStickers() {
return stickers;
}

public void setStickers(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractDocument> value) {
this.stickers = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.hash, stream);
writeTLVector(this.stickers, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.hash = readTLString(stream);
this.stickers = readTLVector(stream, context);
}

@Override
public String toString() {
return "messages.stickers#8a8ecd32";
}
}