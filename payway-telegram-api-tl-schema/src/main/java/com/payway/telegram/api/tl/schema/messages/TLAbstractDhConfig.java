package com.payway.telegram.api.tl.schema.messages;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public abstract class TLAbstractDhConfig extends TLObject {

protected TLBytes random;

public TLBytes getRandom() {
return random;
}

public void setRandom(TLBytes value) {
this.random = value;
}


}