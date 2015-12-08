package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLDcOption extends TLObject {

public static final int CLASS_ID = 784507964;

protected int id;
protected String hostname;
protected String ipAddress;
protected int port;

public TLDcOption() {}

public TLDcOption (int id, String hostname, String ipAddress, int port) {
this.id = id;
this.hostname = hostname;
this.ipAddress = ipAddress;
this.port = port;
}

public int getClassId() {
return CLASS_ID;
}
public int getId() {
return id;
}

public void setId(int value) {
this.id = value;
}

public String getHostname() {
return hostname;
}

public void setHostname(String value) {
this.hostname = value;
}

public String getIpAddress() {
return ipAddress;
}

public void setIpAddress(String value) {
this.ipAddress = value;
}

public int getPort() {
return port;
}

public void setPort(int value) {
this.port = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.id, stream);
writeTLString(this.hostname, stream);
writeTLString(this.ipAddress, stream);
writeInt(this.port, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readInt(stream);
this.hostname = readTLString(stream);
this.ipAddress = readTLString(stream);
this.port = readInt(stream);
}

@Override
public String toString() {
return "dcOption#784507964";
}
}
