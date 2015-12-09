package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLSendMessageCancelAction extends TLAbstractSendMessageAction { 

public static final int CLASS_ID = 0xfd5ec8f5;


public TLSendMessageCancelAction() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "sendMessageCancelAction#fd5ec8f5";
}
}