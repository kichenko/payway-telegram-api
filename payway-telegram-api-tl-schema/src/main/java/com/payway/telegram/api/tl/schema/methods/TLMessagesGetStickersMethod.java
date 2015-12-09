package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesGetStickersMethod extends TLMethod<com.payway.telegram.api.tl.schema.messages.TLAbstractStickers> {

public static final int CLASS_ID = 0xae22e045;

protected String emoticon;
protected String hash;

public TLMessagesGetStickersMethod (String emoticon, String hash) {
this.emoticon = emoticon;
this.hash = hash;
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractStickers deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.messages.TLAbstractStickers) {return (com.payway.telegram.api.tl.schema.messages.TLAbstractStickers)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.messages.TLAbstractStickers, got: " + res.getClass().getCanonicalName()); }
}

public String getEmoticon() {
return emoticon;
}

public void setEmoticon(String value) {
this.emoticon = value;
}

public String getHash() {
return hash;
}

public void setHash(String value) {
this.hash = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.emoticon, stream);
writeTLString(this.hash, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.emoticon = readTLString(stream);
this.hash = readTLString(stream);
}

@Override
public String toString() {
return "messages.getStickers#ae22e045";
}
}
