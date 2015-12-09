package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLContactBlocked extends TLObject {

public static final int CLASS_ID = 0x561bc879;

protected int userId;
protected int date;

public TLContactBlocked() {}

public TLContactBlocked (int userId, int date) {
this.userId = userId;
this.date = date;
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

public int getDate() {
return date;
}

public void setDate(int value) {
this.date = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.userId, stream);
writeInt(this.date, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.userId = readInt(stream);
this.date = readInt(stream);
}

@Override
public String toString() {
return "contactBlocked#561bc879";
}
}
