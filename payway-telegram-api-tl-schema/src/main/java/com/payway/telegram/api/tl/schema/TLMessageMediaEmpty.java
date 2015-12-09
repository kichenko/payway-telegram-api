package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessageMediaEmpty extends TLAbstractMessageMedia { 

public static final int CLASS_ID = 0x3ded6320;


public TLMessageMediaEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "messageMediaEmpty#3ded6320";
}
}