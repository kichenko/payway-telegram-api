package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMessagesFilterVideo extends TLAbstractMessagesFilter { 

public static final int CLASS_ID = 0x9fc00e65;


public TLInputMessagesFilterVideo() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputMessagesFilterVideo#9fc00e65";
}
}