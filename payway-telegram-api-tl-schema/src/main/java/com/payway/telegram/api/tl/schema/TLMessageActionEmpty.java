package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessageActionEmpty extends TLAbstractMessageAction { 

public static final int CLASS_ID = -1230047312;


public TLMessageActionEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "messageActionEmpty#-1230047312";
}
}