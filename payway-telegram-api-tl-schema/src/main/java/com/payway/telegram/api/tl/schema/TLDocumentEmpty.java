package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLDocumentEmpty extends TLAbstractDocument { 

public static final int CLASS_ID = 922273905;


public TLDocumentEmpty() {}

public TLDocumentEmpty (long id) {
this.id = id;
}

public int getClassId() {
return CLASS_ID;
}

@Override
public void serializeBody(OutputStream stream) throws IOException {
writeLong(this.id, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readLong(stream);
}

@Override
public String toString() {
return "documentEmpty#922273905";
}
}