package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdatePrivacy extends TLAbstractUpdate { 

public static final int CLASS_ID = 0xee3b272a;

protected com.payway.telegram.api.tl.schema.TLPrivacyKey key;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractPrivacyRule> rules;

public TLUpdatePrivacy() {}

public TLUpdatePrivacy (com.payway.telegram.api.tl.schema.TLPrivacyKey key, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractPrivacyRule> rules) {
this.key = key;
this.rules = rules;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLPrivacyKey getKey() {
return key;
}

public void setKey(com.payway.telegram.api.tl.schema.TLPrivacyKey value) {
this.key = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractPrivacyRule> getRules() {
return rules;
}

public void setRules(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractPrivacyRule> value) {
this.rules = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.key, stream);
writeTLVector(this.rules, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.key = (com.payway.telegram.api.tl.schema.TLPrivacyKey)readTLObject(stream, context);
this.rules = readTLVector(stream, context);
}

@Override
public String toString() {
return "updatePrivacy#ee3b272a";
}
}