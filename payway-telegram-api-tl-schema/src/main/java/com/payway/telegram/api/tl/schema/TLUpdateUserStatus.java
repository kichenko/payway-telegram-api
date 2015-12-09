package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateUserStatus extends TLAbstractUpdate { 

public static final int CLASS_ID = 0x1bfbd823;

protected int userId;
protected com.payway.telegram.api.tl.schema.TLAbstractUserStatus status;

public TLUpdateUserStatus() {}

public TLUpdateUserStatus (int userId, com.payway.telegram.api.tl.schema.TLAbstractUserStatus status) {
this.userId = userId;
this.status = status;
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

public com.payway.telegram.api.tl.schema.TLAbstractUserStatus getStatus() {
return status;
}

public void setStatus(com.payway.telegram.api.tl.schema.TLAbstractUserStatus value) {
this.status = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.userId, stream);
writeTLObject(this.status, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.userId = readInt(stream);
this.status = (com.payway.telegram.api.tl.schema.TLAbstractUserStatus)readTLObject(stream, context);
}

@Override
public String toString() {
return "updateUserStatus#1bfbd823";
}
}