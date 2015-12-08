package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputFileBig extends TLAbstractInputFile { 

public static final int CLASS_ID = -95482955;


public TLInputFileBig() {}

public TLInputFileBig (long id, int parts, String name) {
this.id = id;
this.parts = parts;
this.name = name;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeLong(this.id, stream);
writeInt(this.parts, stream);
writeTLString(this.name, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readLong(stream);
this.parts = readInt(stream);
this.name = readTLString(stream);
}

@Override
public String toString() {
return "inputFileBig#-95482955";
}
}