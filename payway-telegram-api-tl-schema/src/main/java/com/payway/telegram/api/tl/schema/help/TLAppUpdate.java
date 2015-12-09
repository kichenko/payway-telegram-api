package com.payway.telegram.api.tl.schema.help;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAppUpdate extends TLAbstractAppUpdate { 

public static final int CLASS_ID = 0x8987f311;


public TLAppUpdate() {}

public TLAppUpdate (int id, boolean critical, String url, String text) {
this.id = id;
this.critical = critical;
this.url = url;
this.text = text;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.id, stream);
writeTLBool(this.critical, stream);
writeTLString(this.url, stream);
writeTLString(this.text, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readInt(stream);
this.critical = readTLBool(stream);
this.url = readTLString(stream);
this.text = readTLString(stream);
}

@Override
public String toString() {
return "help.appUpdate#8987f311";
}
}