package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLHelpSaveAppLogMethod extends TLMethod<com.payway.telegram.api.tl.core.TLBool> {

public static final int CLASS_ID = 0x6f02f748;

protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLInputAppEvent> events;

public TLHelpSaveAppLogMethod (com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLInputAppEvent> events) {
this.events = events;
}

public com.payway.telegram.api.tl.core.TLBool deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.core.TLBool) {return (com.payway.telegram.api.tl.core.TLBool)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.core.TLBool, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLInputAppEvent> getEvents() {
return events;
}

public void setEvents(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLInputAppEvent> value) {
this.events = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLVector(this.events, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.events = readTLVector(stream, context);
}

@Override
public String toString() {
return "help.saveAppLog#6f02f748";
}
}
