package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPeerNotifyEventsEmpty extends TLAbstractPeerNotifyEvents { 

public static final int CLASS_ID = -1378534221;


public TLPeerNotifyEventsEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "peerNotifyEventsEmpty#-1378534221";
}
}