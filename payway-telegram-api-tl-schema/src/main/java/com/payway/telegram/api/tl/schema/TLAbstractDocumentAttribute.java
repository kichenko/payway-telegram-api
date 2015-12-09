package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public abstract class TLAbstractDocumentAttribute extends TLObject {

protected int w;
protected int h;

public int getW() {
return w;
}

public void setW(int value) {
this.w = value;
}

public int getH() {
return h;
}

public void setH(int value) {
this.h = value;
}


}