package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLContactFound extends TLObject {

public static final int CLASS_ID = 0xea879f95;

protected int userId;

public TLContactFound() {}

public TLContactFound (int userId) {
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
return "contactFound#ea879f95";
}
}
