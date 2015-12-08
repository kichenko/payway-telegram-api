package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputReportReasonViolence extends TLAbstractReportReason { 

public static final int CLASS_ID = 505595789;


public TLInputReportReasonViolence() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputReportReasonViolence#505595789";
}
}