package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLDocumentAttributeAudio extends TLAbstractDocumentAttribute { 

public static final int CLASS_ID = 0x51448e5;

protected int duration;

public TLDocumentAttributeAudio() {}

public TLDocumentAttributeAudio (int duration) {
this.duration = duration;
}

public int getClassId() {
return CLASS_ID;
}
public int getDuration() {
return duration;
}

public void setDuration(int value) {
this.duration = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.duration, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.duration = readInt(stream);
}

@Override
public String toString() {
return "documentAttributeAudio#51448e5";
}
}