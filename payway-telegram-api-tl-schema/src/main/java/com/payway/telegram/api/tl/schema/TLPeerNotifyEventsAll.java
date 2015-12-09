package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPeerNotifyEventsAll extends TLAbstractPeerNotifyEvents { 

public static final int CLASS_ID = 0x6d1ded88;


public TLPeerNotifyEventsAll() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "peerNotifyEventsAll#6d1ded88";
}
}