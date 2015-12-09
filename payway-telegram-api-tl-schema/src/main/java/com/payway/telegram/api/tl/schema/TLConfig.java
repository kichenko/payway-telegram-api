package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLConfig extends TLObject {

public static final int CLASS_ID = 0x7dae33e0;

protected int date;
protected int expires;
protected boolean testMode;
protected int thisDc;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLDcOption> dcOptions;
protected int chatBigSize;
protected int chatSizeMax;
protected int broadcastSizeMax;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLDisabledFeature> disabledFeatures;

public TLConfig() {}

public TLConfig (int date, int expires, boolean testMode, int thisDc, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLDcOption> dcOptions, int chatBigSize, int chatSizeMax, int broadcastSizeMax, com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLDisabledFeature> disabledFeatures) {
this.date = date;
this.expires = expires;
this.testMode = testMode;
this.thisDc = thisDc;
this.dcOptions = dcOptions;
this.chatBigSize = chatBigSize;
this.chatSizeMax = chatSizeMax;
this.broadcastSizeMax = broadcastSizeMax;
this.disabledFeatures = disabledFeatures;
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

public int getExpires() {
return expires;
}

public void setExpires(int value) {
this.expires = value;
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

public int getChatBigSize() {
return chatBigSize;
}

public void setChatBigSize(int value) {
this.chatBigSize = value;
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

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLDisabledFeature> getDisabledFeatures() {
return disabledFeatures;
}

public void setDisabledFeatures(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLDisabledFeature> value) {
this.disabledFeatures = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.date, stream);
writeInt(this.expires, stream);
writeTLBool(this.testMode, stream);
writeInt(this.thisDc, stream);
writeTLVector(this.dcOptions, stream);
writeInt(this.chatBigSize, stream);
writeInt(this.chatSizeMax, stream);
writeInt(this.broadcastSizeMax, stream);
writeTLVector(this.disabledFeatures, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.date = readInt(stream);
this.expires = readInt(stream);
this.testMode = readTLBool(stream);
this.thisDc = readInt(stream);
this.dcOptions = readTLVector(stream, context);
this.chatBigSize = readInt(stream);
this.chatSizeMax = readInt(stream);
this.broadcastSizeMax = readInt(stream);
this.disabledFeatures = readTLVector(stream, context);
}

@Override
public String toString() {
return "config#7dae33e0";
}
}
