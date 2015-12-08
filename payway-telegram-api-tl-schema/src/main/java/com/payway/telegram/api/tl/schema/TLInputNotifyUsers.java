package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputNotifyUsers extends TLAbstractInputNotifyPeer { 

public static final int CLASS_ID = 423314455;


public TLInputNotifyUsers() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputNotifyUsers#423314455";
}
}