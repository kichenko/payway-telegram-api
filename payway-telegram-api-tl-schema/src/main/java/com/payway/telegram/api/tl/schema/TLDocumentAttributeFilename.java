package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLDocumentAttributeFilename extends TLAbstractDocumentAttribute { 

public static final int CLASS_ID = 0x15590068;

protected String fileName;

public TLDocumentAttributeFilename() {}

public TLDocumentAttributeFilename (String fileName) {
this.fileName = fileName;
}

public int getClassId() {
return CLASS_ID;
}
public String getFileName() {
return fileName;
}

public void setFileName(String value) {
this.fileName = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.fileName, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.fileName = readTLString(stream);
}

@Override
public String toString() {
return "documentAttributeFilename#15590068";
}
}