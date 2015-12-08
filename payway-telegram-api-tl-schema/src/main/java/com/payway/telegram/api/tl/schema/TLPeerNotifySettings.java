package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPeerNotifySettings extends TLAbstractPeerNotifySettings { 

public static final int CLASS_ID = -1923214866;

protected int muteUntil;
protected String sound;
protected boolean showPreviews;
protected int eventsMask;

public TLPeerNotifySettings() {}

public TLPeerNotifySettings (int muteUntil, String sound, boolean showPreviews, int eventsMask) {
this.muteUntil = muteUntil;
this.sound = sound;
this.showPreviews = showPreviews;
this.eventsMask = eventsMask;
}

public int getClassId() {
return CLASS_ID;
}
public int getMuteUntil() {
return muteUntil;
}

public void setMuteUntil(int value) {
this.muteUntil = value;
}

public String getSound() {
return sound;
}

public void setSound(String value) {
this.sound = value;
}

public boolean getShowPreviews() {
return showPreviews;
}

public void setShowPreviews(boolean value) {
this.showPreviews = value;
}

public int getEventsMask() {
return eventsMask;
}

public void setEventsMask(int value) {
this.eventsMask = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.muteUntil, stream);
writeTLString(this.sound, stream);
writeTLBool(this.showPreviews, stream);
writeInt(this.eventsMask, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.muteUntil = readInt(stream);
this.sound = readTLString(stream);
this.showPreviews = readTLBool(stream);
this.eventsMask = readInt(stream);
}

@Override
public String toString() {
return "peerNotifySettings#-1923214866";
}
}