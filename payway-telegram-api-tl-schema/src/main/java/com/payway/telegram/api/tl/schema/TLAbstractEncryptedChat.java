package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public abstract class TLAbstractEncryptedChat extends TLObject {

protected int id;

public int getId() {
return id;
}

public void setId(int value) {
this.id = value;
}


}