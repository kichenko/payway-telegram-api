package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLTrue extends TLObject {

public static final int CLASS_ID = 0x3fedd339;


public TLTrue() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "true#3fedd339";
}
}
