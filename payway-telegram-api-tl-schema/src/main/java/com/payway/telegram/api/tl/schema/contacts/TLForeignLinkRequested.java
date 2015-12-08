package com.payway.telegram.api.tl.schema.contacts;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLForeignLinkRequested extends TLAbstractForeignLink { 

public static final int CLASS_ID = -1484775609;

protected boolean hasPhone;

public TLForeignLinkRequested() {}

public TLForeignLinkRequested (boolean hasPhone) {
this.hasPhone = hasPhone;
}

public int getClassId() {
return CLASS_ID;
}
public boolean getHasPhone() {
return hasPhone;
}

public void setHasPhone(boolean value) {
this.hasPhone = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLBool(this.hasPhone, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.hasPhone = readTLBool(stream);
}

@Override
public String toString() {
return "contacts.foreignLinkRequested#-1484775609";
}
}