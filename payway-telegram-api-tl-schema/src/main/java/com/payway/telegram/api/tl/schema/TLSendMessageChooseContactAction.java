package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLSendMessageChooseContactAction extends TLAbstractSendMessageAction { 

public static final int CLASS_ID = 1653390447;


public TLSendMessageChooseContactAction() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "sendMessageChooseContactAction#1653390447";
}
}