package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputNotifyAll extends TLAbstractInputNotifyPeer { 

public static final int CLASS_ID = -1540769658;


public TLInputNotifyAll() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputNotifyAll#-1540769658";
}
}