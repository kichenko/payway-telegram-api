package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateServiceNotification extends TLAbstractUpdate { 

public static final int CLASS_ID = 0x382dd3e4;

protected String type;
protected String message;
protected com.payway.telegram.api.tl.schema.TLAbstractMessageMedia media;
protected boolean popup;

public TLUpdateServiceNotification() {}

public TLUpdateServiceNotification (String type, String message, com.payway.telegram.api.tl.schema.TLAbstractMessageMedia media, boolean popup) {
this.type = type;
this.message = message;
this.media = media;
this.popup = popup;
}

public int getClassId() {
return CLASS_ID;
}
public String getType() {
return type;
}

public void setType(String value) {
this.type = value;
}

public String getMessage() {
return message;
}

public void setMessage(String value) {
this.message = value;
}

public com.payway.telegram.api.tl.schema.TLAbstractMessageMedia getMedia() {
return media;
}

public void setMedia(com.payway.telegram.api.tl.schema.TLAbstractMessageMedia value) {
this.media = value;
}

public boolean getPopup() {
return popup;
}

public void setPopup(boolean value) {
this.popup = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLString(this.type, stream);
writeTLString(this.message, stream);
writeTLObject(this.media, stream);
writeTLBool(this.popup, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.type = readTLString(stream);
this.message = readTLString(stream);
this.media = (com.payway.telegram.api.tl.schema.TLAbstractMessageMedia)readTLObject(stream, context);
this.popup = readTLBool(stream);
}

@Override
public String toString() {
return "updateServiceNotification#382dd3e4";
}
}