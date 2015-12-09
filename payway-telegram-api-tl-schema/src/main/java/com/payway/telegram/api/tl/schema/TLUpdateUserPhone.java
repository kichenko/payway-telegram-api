package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateUserPhone extends TLAbstractUpdate { 

public static final int CLASS_ID = 0x12b9417b;

protected int userId;
protected String phone;

public TLUpdateUserPhone() {}

public TLUpdateUserPhone (int userId, String phone) {
this.userId = userId;
this.phone = phone;
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

public String getPhone() {
return phone;
}

public void setPhone(String value) {
this.phone = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.userId, stream);
writeTLString(this.phone, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.userId = readInt(stream);
this.phone = readTLString(stream);
}

@Override
public String toString() {
return "updateUserPhone#12b9417b";
}
}