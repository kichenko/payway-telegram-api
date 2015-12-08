package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputPeerNotifyEventsAll extends TLAbstractInputPeerNotifyEvents { 

public static final int CLASS_ID = -395694988;


public TLInputPeerNotifyEventsAll() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputPeerNotifyEventsAll#-395694988";
}
}