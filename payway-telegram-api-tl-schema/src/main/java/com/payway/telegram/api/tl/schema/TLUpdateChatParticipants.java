package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateChatParticipants extends TLAbstractUpdate { 

public static final int CLASS_ID = 125178264;

protected com.payway.telegram.api.tl.schema.TLAbstractChatParticipants participants;

public TLUpdateChatParticipants() {}

public TLUpdateChatParticipants (com.payway.telegram.api.tl.schema.TLAbstractChatParticipants participants) {
this.participants = participants;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractChatParticipants getParticipants() {
return participants;
}

public void setParticipants(com.payway.telegram.api.tl.schema.TLAbstractChatParticipants value) {
this.participants = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.participants, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.participants = (com.payway.telegram.api.tl.schema.TLAbstractChatParticipants)readTLObject(stream, context);
}

@Override
public String toString() {
return "updateChatParticipants#125178264";
}
}