package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLContactSuggested extends TLObject {

public static final int CLASS_ID = 0x3de191a1;

protected int userId;
protected int mutualContacts;

public TLContactSuggested() {}

public TLContactSuggested (int userId, int mutualContacts) {
this.userId = userId;
this.mutualContacts = mutualContacts;
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

public int getMutualContacts() {
return mutualContacts;
}

public void setMutualContacts(int value) {
this.mutualContacts = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.userId, stream);
writeInt(this.mutualContacts, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.userId = readInt(stream);
this.mutualContacts = readInt(stream);
}

@Override
public String toString() {
return "contactSuggested#3de191a1";
}
}
