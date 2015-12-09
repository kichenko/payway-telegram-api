package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputPeerNotifyEventsAll extends TLAbstractInputPeerNotifyEvents { 

public static final int CLASS_ID = 0xe86a2c74;


public TLInputPeerNotifyEventsAll() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputPeerNotifyEventsAll#e86a2c74";
}
}