package com.payway.telegram.api.tl.schema.messages;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAllStickers extends TLAbstractAllStickers { 

public static final int CLASS_ID = 0xdcef3102;

protected String hash;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLStickerPack> packs;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractDocument> documents;

public TLAllStickers() {}

public TLAllStickers (String hash, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLStickerPack> packs, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractDocument> documents) {
this.hash = hash;
this.packs = packs;
this.documents = documents;
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

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLStickerPack> getPacks() {
return packs;
}

public void setPacks(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLStickerPack> value) {
this.packs = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractDocument> getDocuments() {
return documents;
}

public void setDocuments(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractDocument> value) {
this.documents = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.hash, stream);
writeTLVector(this.packs, stream);
writeTLVector(this.documents, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.hash = readTLString(stream);
this.packs = readTLVector(stream, context);
this.documents = readTLVector(stream, context);
}

@Override
public String toString() {
return "messages.allStickers#dcef3102";
}
}