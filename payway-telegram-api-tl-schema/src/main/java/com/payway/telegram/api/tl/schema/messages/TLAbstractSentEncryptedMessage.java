package com.payway.telegram.api.tl.schema.messages;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public abstract class TLAbstractSentEncryptedMessage extends TLObject {

protected int date;

public int getDate() {
return date;
}

public void setDate(int value) {
this.date = value;
}


}