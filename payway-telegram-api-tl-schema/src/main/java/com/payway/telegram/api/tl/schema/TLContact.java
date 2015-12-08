package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLContact extends TLObject {

public static final int CLASS_ID = -116274796;

protected int userId;
protected boolean mutual;

public TLContact() {}

public TLContact (int userId, boolean mutual) {
this.userId = userId;
this.mutual = mutual;
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

public boolean getMutual() {
return mutual;
}

public void setMutual(boolean value) {
this.mutual = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.userId, stream);
writeTLBool(this.mutual, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.userId = readInt(stream);
this.mutual = readTLBool(stream);
}

@Override
public String toString() {
return "contact#-116274796";
}
}
