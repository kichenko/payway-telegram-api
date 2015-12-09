package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMessagesFilterEmpty extends TLAbstractMessagesFilter { 

public static final int CLASS_ID = 0x57e2f66c;


public TLInputMessagesFilterEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputMessagesFilterEmpty#57e2f66c";
}
}