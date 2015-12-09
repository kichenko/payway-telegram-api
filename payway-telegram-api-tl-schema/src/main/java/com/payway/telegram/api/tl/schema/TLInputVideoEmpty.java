package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputVideoEmpty extends TLAbstractInputVideo { 

public static final int CLASS_ID = 0x5508ec75;


public TLInputVideoEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputVideoEmpty#5508ec75";
}
}