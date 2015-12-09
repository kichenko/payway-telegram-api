package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAccountSetPrivacyMethod extends TLMethod<com.payway.telegram.api.tl.schema.account.TLPrivacyRules> {

public static final int CLASS_ID = 0xc9f81ce8;

protected com.payway.telegram.api.tl.schema.TLInputPrivacyKey key;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputPrivacyRule> rules;

public TLAccountSetPrivacyMethod (com.payway.telegram.api.tl.schema.TLInputPrivacyKey key, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputPrivacyRule> rules) {
this.key = key;
this.rules = rules;
}

public com.payway.telegram.api.tl.schema.account.TLPrivacyRules deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.account.TLPrivacyRules) {return (com.payway.telegram.api.tl.schema.account.TLPrivacyRules)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.account.TLPrivacyRules, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.schema.TLInputPrivacyKey getKey() {
return key;
}

public void setKey(com.payway.telegram.api.tl.schema.TLInputPrivacyKey value) {
this.key = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputPrivacyRule> getRules() {
return rules;
}

public void setRules(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractInputPrivacyRule> value) {
this.rules = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.key, stream);
writeTLVector(this.rules, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.key = (com.payway.telegram.api.tl.schema.TLInputPrivacyKey)readTLObject(stream, context);
this.rules = readTLVector(stream, context);
}

@Override
public String toString() {
return "account.setPrivacy#c9f81ce8";
}
}
