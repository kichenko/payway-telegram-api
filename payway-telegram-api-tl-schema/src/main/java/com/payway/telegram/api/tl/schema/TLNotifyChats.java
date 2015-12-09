package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLNotifyChats extends TLAbstractNotifyPeer { 

public static final int CLASS_ID = 0xc007cec3;


public TLNotifyChats() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "notifyChats#c007cec3";
}
}