package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMessageActionChatDeletePhoto extends TLAbstractMessageAction { 

public static final int CLASS_ID = 0x95e3fbef;


public TLMessageActionChatDeletePhoto() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "messageActionChatDeletePhoto#95e3fbef";
}
}