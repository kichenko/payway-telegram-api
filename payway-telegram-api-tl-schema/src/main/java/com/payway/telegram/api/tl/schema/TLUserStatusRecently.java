package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUserStatusRecently extends TLAbstractUserStatus { 

public static final int CLASS_ID = 0xe26f42f1;


public TLUserStatusRecently() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "userStatusRecently#e26f42f1";
}
}