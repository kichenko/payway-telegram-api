package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputNotifyChats extends TLAbstractInputNotifyPeer { 

public static final int CLASS_ID = 1251338318;


public TLInputNotifyChats() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputNotifyChats#1251338318";
}
}