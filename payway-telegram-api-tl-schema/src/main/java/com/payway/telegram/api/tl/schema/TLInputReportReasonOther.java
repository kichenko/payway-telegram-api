package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputReportReasonOther extends TLAbstractReportReason { 

public static final int CLASS_ID = 0xe1746d0a;

protected String text;

public TLInputReportReasonOther() {}

public TLInputReportReasonOther (String text) {
this.text = text;
}

public int getClassId() {
return CLASS_ID;
}
public String getText() {
return text;
}

public void setText(String value) {
this.text = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.text, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.text = readTLString(stream);
}

@Override
public String toString() {
return "inputReportReasonOther#e1746d0a";
}
}