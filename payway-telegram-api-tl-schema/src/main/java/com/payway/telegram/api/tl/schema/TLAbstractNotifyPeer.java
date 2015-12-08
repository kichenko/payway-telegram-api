package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public abstract class TLAbstractNotifyPeer extends TLObject {

protected com.payway.telegram.api.tl.schema.TLAbstractPeer peer;

public com.payway.telegram.api.tl.schema.TLAbstractPeer getPeer() {
return peer;
}

public void setPeer(com.payway.telegram.api.tl.schema.TLAbstractPeer value) {
this.peer = value;
}


}