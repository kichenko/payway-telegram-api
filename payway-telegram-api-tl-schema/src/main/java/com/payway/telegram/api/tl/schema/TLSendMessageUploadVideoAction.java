package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLSendMessageUploadVideoAction extends TLAbstractSendMessageAction { 

public static final int CLASS_ID = 0x92042ff7;


public TLSendMessageUploadVideoAction() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "sendMessageUploadVideoAction#92042ff7";
}
}