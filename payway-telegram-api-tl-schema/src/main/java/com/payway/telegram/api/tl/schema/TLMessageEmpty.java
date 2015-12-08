package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessageEmpty extends TLAbstractMessage { 

public static final int CLASS_ID = -2082087340;


public TLMessageEmpty() {}

public TLMessageEmpty (int id) {
this.id = id;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.id, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readInt(stream);
}

@Override
public String toString() {
return "messageEmpty#-2082087340";
}
}