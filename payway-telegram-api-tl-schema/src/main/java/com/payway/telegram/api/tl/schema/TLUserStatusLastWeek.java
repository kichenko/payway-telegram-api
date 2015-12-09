package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUserStatusLastWeek extends TLAbstractUserStatus { 

public static final int CLASS_ID = 0x7bf09fc;


public TLUserStatusLastWeek() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "userStatusLastWeek#7bf09fc";
}
}