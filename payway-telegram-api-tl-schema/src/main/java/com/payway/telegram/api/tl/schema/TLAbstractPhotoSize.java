package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public abstract class TLAbstractPhotoSize extends TLObject {

protected String type;

public String getType() {
return type;
}

public void setType(String value) {
this.type = value;
}


}