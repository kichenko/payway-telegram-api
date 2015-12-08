package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLEncryptedChatRequested extends TLAbstractEncryptedChat { 

public static final int CLASS_ID = -931638658;

protected long accessHash;
protected int date;
protected int adminId;
protected int participantId;
protected TLBytes gA;

public TLEncryptedChatRequested() {}

public TLEncryptedChatRequested (int id, long accessHash, int date, int adminId, int participantId, TLBytes gA) {
this.id = id;
this.accessHash = accessHash;
this.date = date;
this.adminId = adminId;
this.participantId = participantId;
this.gA = gA;
}

public int getClassId() {
return CLASS_ID;
}
public long getAccessHash() {
return accessHash;
}

public void setAccessHash(long value) {
this.accessHash = value;
}

public int getDate() {
return date;
}

public void setDate(int value) {
this.date = value;
}

public int getAdminId() {
return adminId;
}

public void setAdminId(int value) {
this.adminId = value;
}

public int getParticipantId() {
return participantId;
}

public void setParticipantId(int value) {
this.participantId = value;
}

public TLBytes getGA() {
return gA;
}

public void setGA(TLBytes value) {
this.gA = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.id, stream);
writeLong(this.accessHash, stream);
writeInt(this.date, stream);
writeInt(this.adminId, stream);
writeInt(this.participantId, stream);
writeTLBytes(this.gA, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readInt(stream);
this.accessHash = readLong(stream);
this.date = readInt(stream);
this.adminId = readInt(stream);
this.participantId = readInt(stream);
this.gA = readTLBytes(stream, context);
}

@Override
public String toString() {
return "encryptedChatRequested#-931638658";
}
}