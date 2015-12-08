package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputFile extends TLAbstractInputFile { 

public static final int CLASS_ID = -181407105;


public TLInputFile() {}

public TLInputFile (long id, int parts, String name, String md5Checksum) {
this.id = id;
this.parts = parts;
this.name = name;
this.md5Checksum = md5Checksum;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeLong(this.id, stream);
writeInt(this.parts, stream);
writeTLString(this.name, stream);
writeTLString(this.md5Checksum, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readLong(stream);
this.parts = readInt(stream);
this.name = readTLString(stream);
this.md5Checksum = readTLString(stream);
}

@Override
public String toString() {
return "inputFile#-181407105";
}
}