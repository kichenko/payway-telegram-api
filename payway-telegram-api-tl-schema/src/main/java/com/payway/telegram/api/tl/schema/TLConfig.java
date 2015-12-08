package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLConfig extends TLObject {

public static final int CLASS_ID = 777313652;

protected int date;
protected boolean testMode;
protected int thisDc;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLDcOption> dcOptions;
protected int chatSizeMax;
protected int broadcastSizeMax;

public TLConfig() {}

public TLConfig (int date, boolean testMode, int thisDc, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLDcOption> dcOptions, int chatSizeMax, int broadcastSizeMax) {
this.date = date;
this.testMode = testMode;
this.thisDc = thisDc;
this.dcOptions = dcOptions;
this.chatSizeMax = chatSizeMax;
this.broadcastSizeMax = broadcastSizeMax;
}

public int getClassId() {
return CLASS_ID;
}
public int getDate() {
return date;
}

public void setDate(int value) {
this.date = value;
}

public boolean getTestMode() {
return testMode;
}

public void setTestMode(boolean value) {
this.testMode = value;
}

public int getThisDc() {
return thisDc;
}

public void setThisDc(int value) {
this.thisDc = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLDcOption> getDcOptions() {
return dcOptions;
}

public void setDcOptions(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLDcOption> value) {
this.dcOptions = value;
}

public int getChatSizeMax() {
return chatSizeMax;
}

public void setChatSizeMax(int value) {
this.chatSizeMax = value;
}

public int getBroadcastSizeMax() {
return broadcastSizeMax;
}

public void setBroadcastSizeMax(int value) {
this.broadcastSizeMax = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.date, stream);
writeTLBool(this.testMode, stream);
writeInt(this.thisDc, stream);
writeTLVector(this.dcOptions, stream);
writeInt(this.chatSizeMax, stream);
writeInt(this.broadcastSizeMax, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.date = readInt(stream);
this.testMode = readTLBool(stream);
this.thisDc = readInt(stream);
this.dcOptions = readTLVector(stream, context);
this.chatSizeMax = readInt(stream);
this.broadcastSizeMax = readInt(stream);
}

@Override
public String toString() {
return "config#777313652";
}
}
