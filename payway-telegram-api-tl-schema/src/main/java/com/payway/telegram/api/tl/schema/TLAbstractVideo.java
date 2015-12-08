package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public abstract class TLAbstractVideo extends TLObject {

protected long id;

public long getId() {
return id;
}

public void setId(long value) {
this.id = value;
}


}