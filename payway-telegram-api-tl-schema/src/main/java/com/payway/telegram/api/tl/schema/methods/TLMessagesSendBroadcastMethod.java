package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessagesSendBroadcastMethod extends TLMethod<com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessages> {

public static final int CLASS_ID = 1102776690;

protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputUser> contacts;
protected String message;
protected com.payway.telegram.api.tl.schema.TLAbstractInputMedia media;

public TLMessagesSendBroadcastMethod (com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputUser> contacts, String message, com.payway.telegram.api.tl.schema.TLAbstractInputMedia media) {
this.contacts = contacts;
this.message = message;
this.media = media;
}

public com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessages deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessages) {return (com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessages)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.messages.TLAbstractStatedMessages, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputUser> getContacts() {
return contacts;
}

public void setContacts(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputUser> value) {
this.contacts = value;
}

public String getMessage() {
return message;
}

public void setMessage(String value) {
this.message = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractInputMedia getMedia() {
return media;
}

public void setMedia(com.payway.telegram.api.tl.schema.TLAbstractInputMedia value) {
this.media = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.contacts, stream);
writeTLString(this.message, stream);
writeTLObject(this.media, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.contacts = readTLVector(stream, context);
this.message = readTLString(stream);
this.media = (com.payway.telegram.api.tl.schema.TLAbstractInputMedia)readTLObject(stream, context);
}

@Override
public String toString() {
return "messages.sendBroadcast#1102776690";
}
}
