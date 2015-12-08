package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUpdatesTooLong extends TLAbstractUpdates { 

public static final int CLASS_ID = -484987010;


public TLUpdatesTooLong() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "updatesTooLong#-484987010";
}
}