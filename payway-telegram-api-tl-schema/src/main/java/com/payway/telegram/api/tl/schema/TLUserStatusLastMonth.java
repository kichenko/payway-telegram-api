package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUserStatusLastMonth extends TLAbstractUserStatus { 

public static final int CLASS_ID = 0x77ebc742;


public TLUserStatusLastMonth() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "userStatusLastMonth#77ebc742";
}
}