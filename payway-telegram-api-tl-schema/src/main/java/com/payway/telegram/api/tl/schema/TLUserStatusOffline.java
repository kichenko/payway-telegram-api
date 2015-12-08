package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUserStatusOffline extends TLAbstractUserStatus { 

public static final int CLASS_ID = 9203775;

protected int wasOnline;

public TLUserStatusOffline() {}

public TLUserStatusOffline (int wasOnline) {
this.wasOnline = wasOnline;
}

public int getClassId() {
return CLASS_ID;
}
public int getWasOnline() {
return wasOnline;
}

public void setWasOnline(int value) {
this.wasOnline = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.wasOnline, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.wasOnline = readInt(stream);
}

@Override
public String toString() {
return "userStatusOffline#9203775";
}
}