package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPeerNotifyEventsAll extends TLAbstractPeerNotifyEvents { 

public static final int CLASS_ID = 1830677896;


public TLPeerNotifyEventsAll() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "peerNotifyEventsAll#1830677896";
}
}