package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputNotifyUsers extends TLAbstractInputNotifyPeer { 

public static final int CLASS_ID = 0x193b4417;


public TLInputNotifyUsers() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputNotifyUsers#193b4417";
}
}