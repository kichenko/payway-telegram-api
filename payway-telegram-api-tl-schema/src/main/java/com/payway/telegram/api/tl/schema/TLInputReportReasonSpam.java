package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputReportReasonSpam extends TLAbstractReportReason { 

public static final int CLASS_ID = 0x58dbcab8;


public TLInputReportReasonSpam() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputReportReasonSpam#58dbcab8";
}
}