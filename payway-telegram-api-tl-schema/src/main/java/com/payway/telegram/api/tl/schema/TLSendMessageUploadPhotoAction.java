package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLSendMessageUploadPhotoAction extends TLAbstractSendMessageAction { 

public static final int CLASS_ID = 0x990a3c1a;


public TLSendMessageUploadPhotoAction() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "sendMessageUploadPhotoAction#990a3c1a";
}
}