package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputPeerNotifyEventsEmpty extends TLAbstractInputPeerNotifyEvents { 

public static final int CLASS_ID = 0xf03064d8;


public TLInputPeerNotifyEventsEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputPeerNotifyEventsEmpty#f03064d8";
}
}