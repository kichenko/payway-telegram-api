package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLChatParticipant extends TLObject {

public static final int CLASS_ID = 0xc8d7493e;

protected int userId;
protected int inviterId;
protected int date;

public TLChatParticipant() {}

public TLChatParticipant (int userId, int inviterId, int date) {
this.userId = userId;
this.inviterId = inviterId;
this.date = date;
}

public int getClassId() {
return CLASS_ID;
}
public int getUserId() {
return userId;
}

public void setUserId(int value) {
this.userId = value;
}

public int getInviterId() {
return inviterId;
}

public void setInviterId(int value) {
this.inviterId = value;
}

public int getDate() {
return date;
}

public void setDate(int value) {
this.date = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.userId, stream);
writeInt(this.inviterId, stream);
writeInt(this.date, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.userId = readInt(stream);
this.inviterId = readInt(stream);
this.date = readInt(stream);
}

@Override
public String toString() {
return "chatParticipant#c8d7493e";
}
}
