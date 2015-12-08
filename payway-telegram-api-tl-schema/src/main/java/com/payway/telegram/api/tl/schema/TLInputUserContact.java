package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputUserContact extends TLAbstractInputUser { 

public static final int CLASS_ID = -2031530139;

protected int userId;

public TLInputUserContact() {}

public TLInputUserContact (int userId) {
this.userId = userId;
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


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.userId, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.userId = readInt(stream);
}

@Override
public String toString() {
return "inputUserContact#-2031530139";
}
}