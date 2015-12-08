package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLNotifyChats extends TLAbstractNotifyPeer { 

public static final int CLASS_ID = -1073230141;


public TLNotifyChats() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "notifyChats#-1073230141";
}
}