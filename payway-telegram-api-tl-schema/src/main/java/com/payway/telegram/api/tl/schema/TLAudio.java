package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAudio extends TLAbstractAudio { 

public static final int CLASS_ID = 0xc7ac6496;

protected long accessHash;
protected int userId;
protected int date;
protected int duration;
protected String mimeType;
protected int size;
protected int dcId;

public TLAudio() {}

public TLAudio (long id, long accessHash, int userId, int date, int duration, String mimeType, int size, int dcId) {
this.id = id;
this.accessHash = accessHash;
this.userId = userId;
this.date = date;
this.duration = duration;
this.mimeType = mimeType;
this.size = size;
this.dcId = dcId;
}

public int getClassId() {
return CLASS_ID;
}
public long getAccessHash() {
return accessHash;
}

public void setAccessHash(long value) {
this.accessHash = value;
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

public int getDuration() {
return duration;
}

public void setDuration(int value) {
this.duration = value;
}

public String getMimeType() {
return mimeType;
}

public void setMimeType(String value) {
this.mimeType = value;
}

public int getSize() {
return size;
}

public void setSize(int value) {
this.size = value;
}

public int getDcId() {
return dcId;
}

public void setDcId(int value) {
this.dcId = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeLong(this.id, stream);
writeLong(this.accessHash, stream);
writeInt(this.userId, stream);
writeInt(this.date, stream);
writeInt(this.duration, stream);
writeTLString(this.mimeType, stream);
writeInt(this.size, stream);
writeInt(this.dcId, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readLong(stream);
this.accessHash = readLong(stream);
this.userId = readInt(stream);
this.date = readInt(stream);
this.duration = readInt(stream);
this.mimeType = readTLString(stream);
this.size = readInt(stream);
this.dcId = readInt(stream);
}

@Override
public String toString() {
return "audio#c7ac6496";
}
}