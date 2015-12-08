package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLSendMessageRecordAudioAction extends TLAbstractSendMessageAction { 

public static final int CLASS_ID = -718310409;


public TLSendMessageRecordAudioAction() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "sendMessageRecordAudioAction#-718310409";
}
}