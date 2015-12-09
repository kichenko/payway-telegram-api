package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUserFull extends TLObject {

public static final int CLASS_ID = 0x771095da;

protected com.payway.telegram.api.tl.schema.TLAbstractUser user;
protected com.payway.telegram.api.tl.schema.contacts.TLLink link;
protected com.payway.telegram.api.tl.schema.TLAbstractPhoto profilePhoto;
protected com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings notifySettings;
protected boolean blocked;
protected String realFirstName;
protected String realLastName;

public TLUserFull() {}

public TLUserFull (com.payway.telegram.api.tl.schema.TLAbstractUser user, com.payway.telegram.api.tl.schema.contacts.TLLink link, com.payway.telegram.api.tl.schema.TLAbstractPhoto profilePhoto, com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings notifySettings, boolean blocked, String realFirstName, String realLastName) {
this.user = user;
this.link = link;
this.profilePhoto = profilePhoto;
this.notifySettings = notifySettings;
this.blocked = blocked;
this.realFirstName = realFirstName;
this.realLastName = realLastName;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractUser getUser() {
return user;
}

public void setUser(com.payway.telegram.api.tl.schema.TLAbstractUser value) {
this.user = value;
}

public com.payway.telegram.api.tl.schema.contacts.TLLink getLink() {
return link;
}

public void setLink(com.payway.telegram.api.tl.schema.contacts.TLLink value) {
this.link = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractPhoto getProfilePhoto() {
return profilePhoto;
}

public void setProfilePhoto(com.payway.telegram.api.tl.schema.TLAbstractPhoto value) {
this.profilePhoto = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings getNotifySettings() {
return notifySettings;
}

public void setNotifySettings(com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings value) {
this.notifySettings = value;
}

public boolean getBlocked() {
return blocked;
}

public void setBlocked(boolean value) {
this.blocked = value;
}

public String getRealFirstName() {
return realFirstName;
}

public void setRealFirstName(String value) {
this.realFirstName = value;
}

public String getRealLastName() {
return realLastName;
}

public void setRealLastName(String value) {
this.realLastName = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.user, stream);
writeTLObject(this.link, stream);
writeTLObject(this.profilePhoto, stream);
writeTLObject(this.notifySettings, stream);
writeTLBool(this.blocked, stream);
writeTLString(this.realFirstName, stream);
writeTLString(this.realLastName, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.user = (com.payway.telegram.api.tl.schema.TLAbstractUser)readTLObject(stream, context);
this.link = (com.payway.telegram.api.tl.schema.contacts.TLLink)readTLObject(stream, context);
this.profilePhoto = (com.payway.telegram.api.tl.schema.TLAbstractPhoto)readTLObject(stream, context);
this.notifySettings = (com.payway.telegram.api.tl.schema.TLAbstractPeerNotifySettings)readTLObject(stream, context);
this.blocked = readTLBool(stream);
this.realFirstName = readTLString(stream);
this.realLastName = readTLString(stream);
}

@Override
public String toString() {
return "userFull#771095da";
}
}
