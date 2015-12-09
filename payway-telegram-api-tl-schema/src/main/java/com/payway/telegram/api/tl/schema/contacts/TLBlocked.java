package com.payway.telegram.api.tl.schema.contacts;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLBlocked extends TLAbstractBlocked { 

public static final int CLASS_ID = 0x1c138d15;


public TLBlocked() {}

public TLBlocked (com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLContactBlocked> blocked, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users) {
this.blocked = blocked;
this.users = users;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.blocked, stream);
writeTLVector(this.users, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.blocked = readTLVector(stream, context);
this.users = readTLVector(stream, context);
}

@Override
public String toString() {
return "contacts.blocked#1c138d15";
}
}