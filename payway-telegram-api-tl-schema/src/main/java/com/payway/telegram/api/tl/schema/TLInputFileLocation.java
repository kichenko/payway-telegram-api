package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputFileLocation extends TLAbstractInputFileLocation { 

public static final int CLASS_ID = 342061462;


public TLInputFileLocation() {}

public TLInputFileLocation (long volumeId, int localId, long secret) {
this.volumeId = volumeId;
this.localId = localId;
this.secret = secret;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeLong(this.volumeId, stream);
writeInt(this.localId, stream);
writeLong(this.secret, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.volumeId = readLong(stream);
this.localId = readInt(stream);
this.secret = readLong(stream);
}

@Override
public String toString() {
return "inputFileLocation#342061462";
}
}