package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputPhotoCrop extends TLAbstractInputPhotoCrop { 

public static final int CLASS_ID = -644787419;

protected double cropLeft;
protected double cropTop;
protected double cropWidth;

public TLInputPhotoCrop() {}

public TLInputPhotoCrop (double cropLeft, double cropTop, double cropWidth) {
this.cropLeft = cropLeft;
this.cropTop = cropTop;
this.cropWidth = cropWidth;
}

public int getClassId() {
return CLASS_ID;
}
public double getCropLeft() {
return cropLeft;
}

public void setCropLeft(double value) {
this.cropLeft = value;
}

public double getCropTop() {
return cropTop;
}

public void setCropTop(double value) {
this.cropTop = value;
}

public double getCropWidth() {
return cropWidth;
}

public void setCropWidth(double value) {
this.cropWidth = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeDouble(this.cropLeft, stream);
writeDouble(this.cropTop, stream);
writeDouble(this.cropWidth, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.cropLeft = readDouble(stream);
this.cropTop = readDouble(stream);
this.cropWidth = readDouble(stream);
}

@Override
public String toString() {
return "inputPhotoCrop#-644787419";
}
}