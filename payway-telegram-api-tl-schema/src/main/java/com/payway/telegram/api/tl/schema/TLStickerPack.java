package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLStickerPack extends TLObject {

public static final int CLASS_ID = 0x12b299d4;

protected String emoticon;
protected com.payway.telegram.api.tl.core.TLLongVector documents;

public TLStickerPack() {}

public TLStickerPack (String emoticon, com.payway.telegram.api.tl.core.TLLongVector documents) {
this.emoticon = emoticon;
this.documents = documents;
}

public int getClassId() {
return CLASS_ID;
}
public String getEmoticon() {
return emoticon;
}

public void setEmoticon(String value) {
this.emoticon = value;
}

public com.payway.telegram.api.tl.core.TLLongVector getDocuments() {
return documents;
}

public void setDocuments(com.payway.telegram.api.tl.core.TLLongVector value) {
this.documents = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.emoticon, stream);
writeTLVector(this.documents, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.emoticon = readTLString(stream);
this.documents = readTLLongVector(stream, context);
}

@Override
public String toString() {
return "stickerPack#12b299d4";
}
}
