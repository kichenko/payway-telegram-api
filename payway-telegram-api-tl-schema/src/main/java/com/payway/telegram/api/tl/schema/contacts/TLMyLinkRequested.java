package com.payway.telegram.api.tl.schema.contacts;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMyLinkRequested extends TLAbstractMyLink { 

public static final int CLASS_ID = 0x6c69efee;

protected boolean contact;

public TLMyLinkRequested() {}

public TLMyLinkRequested (boolean contact) {
this.contact = contact;
}

public int getClassId() {
return CLASS_ID;
}
public boolean getContact() {
return contact;
}

public void setContact(boolean value) {
this.contact = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLBool(this.contact, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.contact = readTLBool(stream);
}

@Override
public String toString() {
return "contacts.myLinkRequested#6c69efee";
}
}