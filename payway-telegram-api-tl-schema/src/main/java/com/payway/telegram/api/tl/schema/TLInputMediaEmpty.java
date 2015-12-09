package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMediaEmpty extends TLAbstractInputMedia { 

public static final int CLASS_ID = 0x9664f57f;


public TLInputMediaEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputMediaEmpty#9664f57f";
}
}