package com.payway.telegram.api.tl.schema.account;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPrivacyRules extends TLObject {

public static final int CLASS_ID = 0x554abb6f;

protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractPrivacyRule> rules;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users;

public TLPrivacyRules() {}

public TLPrivacyRules (com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractPrivacyRule> rules, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users) {
this.rules = rules;
this.users = users;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractPrivacyRule> getRules() {
return rules;
}

public void setRules(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractPrivacyRule> value) {
this.rules = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> getUsers() {
return users;
}

public void setUsers(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> value) {
this.users = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.rules, stream);
writeTLVector(this.users, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.rules = readTLVector(stream, context);
this.users = readTLVector(stream, context);
}

@Override
public String toString() {
return "account.privacyRules#554abb6f";
}
}
