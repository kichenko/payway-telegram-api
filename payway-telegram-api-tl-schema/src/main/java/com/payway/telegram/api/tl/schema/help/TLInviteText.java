package com.payway.telegram.api.tl.schema.help;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInviteText extends TLObject {

public static final int CLASS_ID = 415997816;

protected String message;

public TLInviteText() {}

public TLInviteText (String message) {
this.message = message;
}

public int getClassId() {
return CLASS_ID;
}
public String getMessage() {
return message;
}

public void setMessage(String value) {
this.message = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.message, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.message = readTLString(stream);
}

@Override
public String toString() {
return "help.inviteText#415997816";
}
}
