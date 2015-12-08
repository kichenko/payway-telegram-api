package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUserStatusOnline extends TLAbstractUserStatus { 

public static final int CLASS_ID = -306628279;

protected int expires;

public TLUserStatusOnline() {}

public TLUserStatusOnline (int expires) {
this.expires = expires;
}

public int getClassId() {
return CLASS_ID;
}
public int getExpires() {
return expires;
}

public void setExpires(int value) {
this.expires = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.expires, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.expires = readInt(stream);
}

@Override
public String toString() {
return "userStatusOnline#-306628279";
}
}