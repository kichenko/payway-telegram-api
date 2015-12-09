package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLDisabledFeature extends TLObject {

public static final int CLASS_ID = 0xae636f24;

protected String feature;
protected String description;

public TLDisabledFeature() {}

public TLDisabledFeature (String feature, String description) {
this.feature = feature;
this.description = description;
}

public int getClassId() {
return CLASS_ID;
}
public String getFeature() {
return feature;
}

public void setFeature(String value) {
this.feature = value;
}

public String getDescription() {
return description;
}

public void setDescription(String value) {
this.description = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.feature, stream);
writeTLString(this.description, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.feature = readTLString(stream);
this.description = readTLString(stream);
}

@Override
public String toString() {
return "disabledFeature#ae636f24";
}
}
