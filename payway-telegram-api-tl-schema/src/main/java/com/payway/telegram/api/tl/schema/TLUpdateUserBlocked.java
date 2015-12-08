package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateUserBlocked extends TLAbstractUpdate { 

public static final int CLASS_ID = -2131957734;

protected int userId;
protected boolean blocked;

public TLUpdateUserBlocked() {}

public TLUpdateUserBlocked (int userId, boolean blocked) {
this.userId = userId;
this.blocked = blocked;
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

public boolean getBlocked() {
return blocked;
}

public void setBlocked(boolean value) {
this.blocked = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.userId, stream);
writeTLBool(this.blocked, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.userId = readInt(stream);
this.blocked = readTLBool(stream);
}

@Override
public String toString() {
return "updateUserBlocked#-2131957734";
}
}