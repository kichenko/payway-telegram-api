package com.payway.telegram.api.tl.schema.contacts;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLBlockedSlice extends TLAbstractBlocked { 

public static final int CLASS_ID = 0x900802a1;

protected int count;

public TLBlockedSlice() {}

public TLBlockedSlice (int count, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLContactBlocked> blocked, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users) {
this.count = count;
this.blocked = blocked;
this.users = users;
}

public int getClassId() {
return CLASS_ID;
}
public int getCount() {
return count;
}

public void setCount(int value) {
this.count = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.count, stream);
writeTLVector(this.blocked, stream);
writeTLVector(this.users, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.count = readInt(stream);
this.blocked = readTLVector(stream, context);
this.users = readTLVector(stream, context);
}

@Override
public String toString() {
return "contacts.blockedSlice#900802a1";
}
}