package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLImportedContact extends TLObject {

public static final int CLASS_ID = -805141448;

protected int userId;
protected long clientId;

public TLImportedContact() {}

public TLImportedContact (int userId, long clientId) {
this.userId = userId;
this.clientId = clientId;
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

public long getClientId() {
return clientId;
}

public void setClientId(long value) {
this.clientId = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.userId, stream);
writeLong(this.clientId, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.userId = readInt(stream);
this.clientId = readLong(stream);
}

@Override
public String toString() {
return "importedContact#-805141448";
}
}
