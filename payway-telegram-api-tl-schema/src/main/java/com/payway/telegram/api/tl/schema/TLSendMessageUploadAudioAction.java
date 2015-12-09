package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLSendMessageUploadAudioAction extends TLAbstractSendMessageAction { 

public static final int CLASS_ID = 0xe6ac8a6f;


public TLSendMessageUploadAudioAction() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "sendMessageUploadAudioAction#e6ac8a6f";
}
}