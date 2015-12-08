package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputAppEvent extends TLObject {

public static final int CLASS_ID = 1996904104;

protected double time;
protected String type;
protected long peer;
protected String data;

public TLInputAppEvent() {}

public TLInputAppEvent (double time, String type, long peer, String data) {
this.time = time;
this.type = type;
this.peer = peer;
this.data = data;
}

public int getClassId() {
return CLASS_ID;
}
public double getTime() {
return time;
}

public void setTime(double value) {
this.time = value;
}

public String getType() {
return type;
}

public void setType(String value) {
this.type = value;
}

public long getPeer() {
return peer;
}

public void setPeer(long value) {
this.peer = value;
}

public String getData() {
return data;
}

public void setData(String value) {
this.data = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeDouble(this.time, stream);
writeTLString(this.type, stream);
writeLong(this.peer, stream);
writeTLString(this.data, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.time = readDouble(stream);
this.type = readTLString(stream);
this.peer = readLong(stream);
this.data = readTLString(stream);
}

@Override
public String toString() {
return "inputAppEvent#1996904104";
}
}
