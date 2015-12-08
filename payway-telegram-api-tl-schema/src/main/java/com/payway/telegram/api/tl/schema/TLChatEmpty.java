package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLChatEmpty extends TLAbstractChat { 

public static final int CLASS_ID = -1683826688;


public TLChatEmpty() {}

public TLChatEmpty (int id) {
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
return "chatEmpty#-1683826688";
}
}