package com.payway.telegram.api.tl.schema.messages;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLSentMessageLink extends TLAbstractSentMessage { 

public static final int CLASS_ID = -371504577;

protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.contacts.TLLink> links;

public TLSentMessageLink() {}

public TLSentMessageLink (int id, int date, int pts, int seq, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.contacts.TLLink> links) {
this.id = id;
this.date = date;
this.pts = pts;
this.seq = seq;
this.links = links;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.contacts.TLLink> getLinks() {
return links;
}

public void setLinks(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.contacts.TLLink> value) {
this.links = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.id, stream);
writeInt(this.date, stream);
writeInt(this.pts, stream);
writeInt(this.seq, stream);
writeTLVector(this.links, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readInt(stream);
this.date = readInt(stream);
this.pts = readInt(stream);
this.seq = readInt(stream);
this.links = readTLVector(stream, context);
}

@Override
public String toString() {
return "messages.sentMessageLink#-371504577";
}
}