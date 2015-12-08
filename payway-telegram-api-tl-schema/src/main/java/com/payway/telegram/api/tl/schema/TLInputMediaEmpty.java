package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMediaEmpty extends TLAbstractInputMedia { 

public static final int CLASS_ID = -1771768449;


public TLInputMediaEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputMediaEmpty#-1771768449";
}
}