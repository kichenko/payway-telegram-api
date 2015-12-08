package com.payway.telegram.api.tl.schema.methods;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAccountReportPeerMethod extends TLMethod<com.payway.telegram.api.tl.core.TLBool> {

public static final int CLASS_ID = -1374118561;

protected com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer;
protected com.payway.telegram.api.tl.schema.TLAbstractReportReason reason;

public TLAccountReportPeerMethod (com.payway.telegram.api.tl.schema.TLAbstractInputPeer peer, com.payway.telegram.api.tl.schema.TLAbstractReportReason reason) {
this.peer = peer;
this.reason = reason;
}

public com.payway.telegram.api.tl.core.TLBool deserializeResponse(InputStream stream, TLContext context) throws IOException {
TLObject res = readTLObject(stream, context);
if (res == null){throw new IOException("Unable to parse response");}
if (res instanceof com.payway.telegram.api.tl.core.TLBool) {return (com.payway.telegram.api.tl.core.TLBool)res;}
else { throw new IOException("Incorrect response type. Expected com.payway.telegram.api.tl.core.TLBool, got: " + res.getClass().getCanonicalName()); }
}

public com.payway.telegram.api.tl.schema.TLAbstractInputPeer getPeer() {
return peer;
}

public void setPeer(com.payway.telegram.api.tl.schema.TLAbstractInputPeer value) {
this.peer = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractReportReason getReason() {
return reason;
}

public void setReason(com.payway.telegram.api.tl.schema.TLAbstractReportReason value) {
this.reason = value;
}


public int getClassId() {
return CLASS_ID;
}
@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.peer, stream);
writeTLObject(this.reason, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.peer = (com.payway.telegram.api.tl.schema.TLAbstractInputPeer)readTLObject(stream, context);
this.reason = (com.payway.telegram.api.tl.schema.TLAbstractReportReason)readTLObject(stream, context);
}

@Override
public String toString() {
return "account.reportPeer#-1374118561";
}
}
