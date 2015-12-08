package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public abstract class TLAbstractPeer extends TLObject {

protected int userId;

public int getUserId() {
return userId;
}

public void setUserId(int value) {
this.userId = value;
}


}