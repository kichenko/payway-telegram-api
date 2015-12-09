package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputReportReasonViolence extends TLAbstractReportReason { 

public static final int CLASS_ID = 0x1e22c78d;


public TLInputReportReasonViolence() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputReportReasonViolence#1e22c78d";
}
}