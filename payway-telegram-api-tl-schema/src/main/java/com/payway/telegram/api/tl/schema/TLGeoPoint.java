package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLGeoPoint extends TLAbstractGeoPoint { 

public static final int CLASS_ID = 541710092;

protected double lon;
protected double lat;

public TLGeoPoint() {}

public TLGeoPoint (double lon, double lat) {
this.lon = lon;
this.lat = lat;
}

public int getClassId() {
return CLASS_ID;
}
public double getLon() {
return lon;
}

public void setLon(double value) {
this.lon = value;
}

public double getLat() {
return lat;
}

public void setLat(double value) {
this.lat = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeDouble(this.lon, stream);
writeDouble(this.lat, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.lon = readDouble(stream);
this.lat = readDouble(stream);
}

@Override
public String toString() {
return "geoPoint#541710092";
}
}