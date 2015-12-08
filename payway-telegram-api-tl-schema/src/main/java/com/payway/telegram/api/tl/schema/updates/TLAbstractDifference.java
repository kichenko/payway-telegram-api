package com.payway.telegram.api.tl.schema.updates;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public abstract class TLAbstractDifference extends TLObject {

protected int date;
protected int seq;

public int getDate() {
return date;
}

public void setDate(int value) {
this.date = value;
}

public int getSeq() {
return seq;
}

public void setSeq(int value) {
this.seq = value;
}


}