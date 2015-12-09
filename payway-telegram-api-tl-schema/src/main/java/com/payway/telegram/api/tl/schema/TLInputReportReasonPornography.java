package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputReportReasonPornography extends TLAbstractReportReason { 

public static final int CLASS_ID = 0x2e59d922;


public TLInputReportReasonPornography() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputReportReasonPornography#2e59d922";
}
}