package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLEncryptedChat extends TLAbstractEncryptedChat { 

public static final int CLASS_ID = -94974410;

protected long accessHash;
protected int date;
protected int adminId;
protected int participantId;
protected TLBytes gAOrB;
protected long keyFingerprint;

public TLEncryptedChat() {}

public TLEncryptedChat (int id, long accessHash, int date, int adminId, int participantId, TLBytes gAOrB, long keyFingerprint) {
this.id = id;
this.accessHash = accessHash;
this.date = date;
this.adminId = adminId;
this.participantId = participantId;
this.gAOrB = gAOrB;
this.keyFingerprint = keyFingerprint;
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

public TLBytes getGAOrB() {
return gAOrB;
}

public void setGAOrB(TLBytes value) {
this.gAOrB = value;
}

public long getKeyFingerprint() {
return keyFingerprint;
}

public void setKeyFingerprint(long value) {
this.keyFingerprint = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.id, stream);
writeLong(this.accessHash, stream);
writeInt(this.date, stream);
writeInt(this.adminId, stream);
writeInt(this.participantId, stream);
writeTLBytes(this.gAOrB, stream);
writeLong(this.keyFingerprint, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readInt(stream);
this.accessHash = readLong(stream);
this.date = readInt(stream);
this.adminId = readInt(stream);
this.participantId = readInt(stream);
this.gAOrB = readTLBytes(stream, context);
this.keyFingerprint = readLong(stream);
}

@Override
public String toString() {
return "encryptedChat#-94974410";
}
}