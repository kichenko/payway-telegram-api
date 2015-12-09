package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLSendMessageRecordVideoAction extends TLAbstractSendMessageAction { 

public static final int CLASS_ID = 0xa187d66f;


public TLSendMessageRecordVideoAction() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "sendMessageRecordVideoAction#a187d66f";
}
}