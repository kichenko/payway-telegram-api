package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputGeoPoint extends TLAbstractInputGeoPoint { 

public static final int CLASS_ID = -206066487;

protected double lat;
protected double lon;

public TLInputGeoPoint() {}

public TLInputGeoPoint (double lat, double lon) {
this.lat = lat;
this.lon = lon;
}

public int getClassId() {
return CLASS_ID;
}
public double getLat() {
return lat;
}

public void setLat(double value) {
this.lat = value;
}

public double getLon() {
return lon;
}

public void setLon(double value) {
this.lon = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeDouble(this.lat, stream);
writeDouble(this.lon, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.lat = readDouble(stream);
this.lon = readDouble(stream);
}

@Override
public String toString() {
return "inputGeoPoint#-206066487";
}
}