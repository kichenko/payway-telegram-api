package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLSendMessageRecordAudioAction extends TLAbstractSendMessageAction { 

public static final int CLASS_ID = 0xd52f73f7;


public TLSendMessageRecordAudioAction() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "sendMessageRecordAudioAction#d52f73f7";
}
}