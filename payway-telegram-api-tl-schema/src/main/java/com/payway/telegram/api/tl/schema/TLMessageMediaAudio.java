package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessageMediaAudio extends TLAbstractMessageMedia { 

public static final int CLASS_ID = 0xc6b68300;

protected com.payway.telegram.api.tl.schema.TLAbstractAudio audio;

public TLMessageMediaAudio() {}

public TLMessageMediaAudio (com.payway.telegram.api.tl.schema.TLAbstractAudio audio) {
this.audio = audio;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractAudio getAudio() {
return audio;
}

public void setAudio(com.payway.telegram.api.tl.schema.TLAbstractAudio value) {
this.audio = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.audio, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.audio = (com.payway.telegram.api.tl.schema.TLAbstractAudio)readTLObject(stream, context);
}

@Override
public String toString() {
return "messageMediaAudio#c6b68300";
}
}