package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputNotifyChats extends TLAbstractInputNotifyPeer { 

public static final int CLASS_ID = 0x4a95e84e;


public TLInputNotifyChats() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputNotifyChats#4a95e84e";
}
}