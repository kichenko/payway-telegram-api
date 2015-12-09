package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMessagesFilterDocument extends TLAbstractMessagesFilter { 

public static final int CLASS_ID = 0x9eddf188;


public TLInputMessagesFilterDocument() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputMessagesFilterDocument#9eddf188";
}
}