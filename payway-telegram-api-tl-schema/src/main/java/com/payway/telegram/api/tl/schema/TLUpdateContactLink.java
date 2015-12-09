package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateContactLink extends TLAbstractUpdate { 

public static final int CLASS_ID = 0x51a48a9a;

protected int userId;
protected com.payway.telegram.api.tl.schema.contacts.TLAbstractMyLink myLink;
protected com.payway.telegram.api.tl.schema.contacts.TLAbstractForeignLink foreignLink;

public TLUpdateContactLink() {}

public TLUpdateContactLink (int userId, com.payway.telegram.api.tl.schema.contacts.TLAbstractMyLink myLink, com.payway.telegram.api.tl.schema.contacts.TLAbstractForeignLink foreignLink) {
this.userId = userId;
this.myLink = myLink;
this.foreignLink = foreignLink;
}

public int getClassId() {
return CLASS_ID;
}
public int getUserId() {
return userId;
}

public void setUserId(int value) {
this.userId = value;
}

public com.payway.telegram.api.tl.schema.contacts.TLAbstractMyLink getMyLink() {
return myLink;
}

public void setMyLink(com.payway.telegram.api.tl.schema.contacts.TLAbstractMyLink value) {
this.myLink = value;
}

public com.payway.telegram.api.tl.schema.contacts.TLAbstractForeignLink getForeignLink() {
return foreignLink;
}

public void setForeignLink(com.payway.telegram.api.tl.schema.contacts.TLAbstractForeignLink value) {
this.foreignLink = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.userId, stream);
writeTLObject(this.myLink, stream);
writeTLObject(this.foreignLink, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.userId = readInt(stream);
this.myLink = (com.payway.telegram.api.tl.schema.contacts.TLAbstractMyLink)readTLObject(stream, context);
this.foreignLink = (com.payway.telegram.api.tl.schema.contacts.TLAbstractForeignLink)readTLObject(stream, context);
}

@Override
public String toString() {
return "updateContactLink#51a48a9a";
}
}