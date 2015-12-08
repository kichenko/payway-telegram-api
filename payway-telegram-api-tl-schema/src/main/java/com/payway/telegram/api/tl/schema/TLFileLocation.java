package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLFileLocation extends TLAbstractFileLocation { 

public static final int CLASS_ID = 1406570614;

protected int dcId;

public TLFileLocation() {}

public TLFileLocation (int dcId, long volumeId, int localId, long secret) {
this.dcId = dcId;
this.volumeId = volumeId;
this.localId = localId;
this.secret = secret;
}

public int getClassId() {
return CLASS_ID;
}
public int getDcId() {
return dcId;
}

public void setDcId(int value) {
this.dcId = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.dcId, stream);
writeLong(this.volumeId, stream);
writeInt(this.localId, stream);
writeLong(this.secret, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.dcId = readInt(stream);
this.volumeId = readLong(stream);
this.localId = readInt(stream);
this.secret = readLong(stream);
}

@Override
public String toString() {
return "fileLocation#1406570614";
}
}