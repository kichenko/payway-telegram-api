package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLSendMessageUploadDocumentAction extends TLAbstractSendMessageAction { 

public static final int CLASS_ID = 0x8faee98e;


public TLSendMessageUploadDocumentAction() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "sendMessageUploadDocumentAction#8faee98e";
}
}