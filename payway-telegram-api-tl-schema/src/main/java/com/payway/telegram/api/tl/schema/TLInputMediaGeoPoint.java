package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMediaGeoPoint extends TLAbstractInputMedia { 

public static final int CLASS_ID = 0xf9c44144;

protected com.payway.telegram.api.tl.schema.TLAbstractInputGeoPoint geoPoint;

public TLInputMediaGeoPoint() {}

public TLInputMediaGeoPoint (com.payway.telegram.api.tl.schema.TLAbstractInputGeoPoint geoPoint) {
this.geoPoint = geoPoint;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractInputGeoPoint getGeoPoint() {
return geoPoint;
}

public void setGeoPoint(com.payway.telegram.api.tl.schema.TLAbstractInputGeoPoint value) {
this.geoPoint = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.geoPoint, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.geoPoint = (com.payway.telegram.api.tl.schema.TLAbstractInputGeoPoint)readTLObject(stream, context);
}

@Override
public String toString() {
return "inputMediaGeoPoint#f9c44144";
}
}