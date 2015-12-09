package com.payway.telegram.api.tl.schema.contacts;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLLink extends TLObject {

public static final int CLASS_ID = 0xeccea3f5;

protected com.payway.telegram.api.tl.schema.contacts.TLAbstractMyLink myLink;
protected com.payway.telegram.api.tl.schema.contacts.TLAbstractForeignLink foreignLink;
protected com.payway.telegram.api.tl.schema.TLAbstractUser user;

public TLLink() {}

public TLLink (com.payway.telegram.api.tl.schema.contacts.TLAbstractMyLink myLink, com.payway.telegram.api.tl.schema.contacts.TLAbstractForeignLink foreignLink, com.payway.telegram.api.tl.schema.TLAbstractUser user) {
this.myLink = myLink;
this.foreignLink = foreignLink;
this.user = user;
}

public int getClassId() {
return CLASS_ID;
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

public com.payway.telegram.api.tl.schema.TLAbstractUser getUser() {
return user;
}

public void setUser(com.payway.telegram.api.tl.schema.TLAbstractUser value) {
this.user = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.myLink, stream);
writeTLObject(this.foreignLink, stream);
writeTLObject(this.user, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.myLink = (com.payway.telegram.api.tl.schema.contacts.TLAbstractMyLink)readTLObject(stream, context);
this.foreignLink = (com.payway.telegram.api.tl.schema.contacts.TLAbstractForeignLink)readTLObject(stream, context);
this.user = (com.payway.telegram.api.tl.schema.TLAbstractUser)readTLObject(stream, context);
}

@Override
public String toString() {
return "contacts.link#eccea3f5";
}
}
