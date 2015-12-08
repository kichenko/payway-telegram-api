package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLVideoEmpty extends TLAbstractVideo { 

public static final int CLASS_ID = -1056548696;


public TLVideoEmpty() {}

public TLVideoEmpty (long id) {
this.id = id;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeLong(this.id, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readLong(stream);
}

@Override
public String toString() {
return "videoEmpty#-1056548696";
}
}