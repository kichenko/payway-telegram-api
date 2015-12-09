package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesGetAllStickersMethod extends TLMethod<com.payway.telegram.api.tl.schema.messages.TLAbstractAllStickers> {

public static final int CLASS_ID = 0xaa3bc868;

protected String hash;

public TLMessagesGetAllStickersMethod (String hash) {
this.hash = hash;
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractAllStickers deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.messages.TLAbstractAllStickers) {return (com.payway.telegram.api.tl.schema.messages.TLAbstractAllStickers)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.messages.TLAbstractAllStickers, got: " + res.getClass().getCanonicalName()); }
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
writeTLString(this.hash, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.hash = readTLString(stream);
}

@Override
public String toString() {
return "messages.getAllStickers#aa3bc868";
}
}
