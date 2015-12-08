package com.payway.telegram.api.tl.schema.messages;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public abstract class TLAbstractSentMessage extends TLObject {

protected int id;
protected int date;
protected int pts;
protected int seq;

public int getId() {
return id;
}

public void setId(int value) {
this.id = value;
}

public int getDate() {
return date;
}

public void setDate(int value) {
this.date = value;
}

public int getPts() {
return pts;
}

public void setPts(int value) {
this.pts = value;
}

public int getSeq() {
return seq;
}

public void setSeq(int value) {
this.seq = value;
}


}