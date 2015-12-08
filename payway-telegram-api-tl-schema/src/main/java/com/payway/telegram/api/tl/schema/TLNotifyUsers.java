package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLNotifyUsers extends TLAbstractNotifyPeer { 

public static final int CLASS_ID = -1261946036;


public TLNotifyUsers() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "notifyUsers#-1261946036";
}
}