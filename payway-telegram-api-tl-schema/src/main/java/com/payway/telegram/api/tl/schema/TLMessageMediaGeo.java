package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessageMediaGeo extends TLAbstractMessageMedia { 

public static final int CLASS_ID = 1457575028;

protected com.payway.telegram.api.tl.schema.TLAbstractGeoPoint geo;

public TLMessageMediaGeo() {}

public TLMessageMediaGeo (com.payway.telegram.api.tl.schema.TLAbstractGeoPoint geo) {
this.geo = geo;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractGeoPoint getGeo() {
return geo;
}

public void setGeo(com.payway.telegram.api.tl.schema.TLAbstractGeoPoint value) {
this.geo = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.geo, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.geo = (com.payway.telegram.api.tl.schema.TLAbstractGeoPoint)readTLObject(stream, context);
}

@Override
public String toString() {
return "messageMediaGeo#1457575028";
}
}