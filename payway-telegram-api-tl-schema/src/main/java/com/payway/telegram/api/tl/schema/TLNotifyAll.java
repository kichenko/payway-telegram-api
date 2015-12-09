package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLNotifyAll extends TLAbstractNotifyPeer { 

public static final int CLASS_ID = 0x74d07c60;


public TLNotifyAll() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "notifyAll#74d07c60";
}
}