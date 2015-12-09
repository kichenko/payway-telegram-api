package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMessagesFilterUrl extends TLAbstractMessagesFilter { 

public static final int CLASS_ID = 0x7ef0dd87;


public TLInputMessagesFilterUrl() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputMessagesFilterUrl#7ef0dd87";
}
}