package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMediaAudio extends TLAbstractInputMedia { 

public static final int CLASS_ID = -1986820223;

protected com.payway.telegram.api.tl.schema.TLAbstractInputAudio id;

public TLInputMediaAudio() {}

public TLInputMediaAudio (com.payway.telegram.api.tl.schema.TLAbstractInputAudio id) {
this.id = id;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractInputAudio getId() {
return id;
}

public void setId(com.payway.telegram.api.tl.schema.TLAbstractInputAudio value) {
this.id = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.id, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = (com.payway.telegram.api.tl.schema.TLAbstractInputAudio)readTLObject(stream, context);
}

@Override
public String toString() {
return "inputMediaAudio#-1986820223";
}
}