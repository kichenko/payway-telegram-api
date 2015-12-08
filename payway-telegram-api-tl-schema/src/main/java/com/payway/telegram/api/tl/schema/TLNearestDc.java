package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLNearestDc extends TLObject {

public static final int CLASS_ID = -1910892683;

protected String country;
protected int thisDc;
protected int nearestDc;

public TLNearestDc() {}

public TLNearestDc (String country, int thisDc, int nearestDc) {
this.country = country;
this.thisDc = thisDc;
this.nearestDc = nearestDc;
}

public int getClassId() {
return CLASS_ID;
}
public String getCountry() {
return country;
}

public void setCountry(String value) {
this.country = value;
}

public int getThisDc() {
return thisDc;
}

public void setThisDc(int value) {
this.thisDc = value;
}

public int getNearestDc() {
return nearestDc;
}

public void setNearestDc(int value) {
this.nearestDc = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.country, stream);
writeInt(this.thisDc, stream);
writeInt(this.nearestDc, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.country = readTLString(stream);
this.thisDc = readInt(stream);
this.nearestDc = readInt(stream);
}

@Override
public String toString() {
return "nearestDc#-1910892683";
}
}
