package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAccountDaysTTL extends TLObject {

public static final int CLASS_ID = 0xb8d0afdf;

protected int days;

public TLAccountDaysTTL() {}

public TLAccountDaysTTL (int days) {
this.days = days;
}

public int getClassId() {
return CLASS_ID;
}
public int getDays() {
return days;
}

public void setDays(int value) {
this.days = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.days, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.days = readInt(stream);
}

@Override
public String toString() {
return "accountDaysTTL#b8d0afdf";
}
}
