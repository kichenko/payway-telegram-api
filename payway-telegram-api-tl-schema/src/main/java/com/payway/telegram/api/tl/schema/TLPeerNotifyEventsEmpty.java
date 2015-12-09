package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPeerNotifyEventsEmpty extends TLAbstractPeerNotifyEvents { 

public static final int CLASS_ID = 0xadd53cb3;


public TLPeerNotifyEventsEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "peerNotifyEventsEmpty#add53cb3";
}
}