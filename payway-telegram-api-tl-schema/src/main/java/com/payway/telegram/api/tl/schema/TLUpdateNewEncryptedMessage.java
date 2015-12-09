package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdateNewEncryptedMessage extends TLAbstractUpdate { 

public static final int CLASS_ID = 0x12bcbd9a;

protected com.payway.telegram.api.tl.schema.TLAbstractEncryptedMessage message;
protected int qts;

public TLUpdateNewEncryptedMessage() {}

public TLUpdateNewEncryptedMessage (com.payway.telegram.api.tl.schema.TLAbstractEncryptedMessage message, int qts) {
this.message = message;
this.qts = qts;
}

public int getClassId() {
return CLASS_ID;
}
public com.payway.telegram.api.tl.schema.TLAbstractEncryptedMessage getMessage() {
return message;
}

public void setMessage(com.payway.telegram.api.tl.schema.TLAbstractEncryptedMessage value) {
this.message = value;
}

public int getQts() {
return qts;
}

public void setQts(int value) {
this.qts = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeTLObject(this.message, stream);
writeInt(this.qts, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.message = (com.payway.telegram.api.tl.schema.TLAbstractEncryptedMessage)readTLObject(stream, context);
this.qts = readInt(stream);
}

@Override
public String toString() {
return "updateNewEncryptedMessage#12bcbd9a";
}
}