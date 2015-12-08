package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLHelpGetInviteTextMethod extends TLMethod<com.payway.telegram.api.tl.schema.help.TLInviteText> {

public static final int CLASS_ID = -1532407418;

protected String langCode;

public TLHelpGetInviteTextMethod (String langCode) {
this.langCode = langCode;
}

public com.payway.telegram.api.tl.schema.help.TLInviteText deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.schema.help.TLInviteText) {return (com.payway.telegram.api.tl.schema.help.TLInviteText)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.schema.help.TLInviteText, got: " + res.getClass().getCanonicalName()); }
}

public String getLangCode() {
return langCode;
}

public void setLangCode(String value) {
this.langCode = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.langCode, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.langCode = readTLString(stream);
}

@Override
public String toString() {
return "help.getInviteText#-1532407418";
}
}
