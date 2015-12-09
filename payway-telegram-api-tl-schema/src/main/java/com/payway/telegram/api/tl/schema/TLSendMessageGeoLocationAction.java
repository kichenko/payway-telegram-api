package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLSendMessageGeoLocationAction extends TLAbstractSendMessageAction { 

public static final int CLASS_ID = 0x176f8ba1;


public TLSendMessageGeoLocationAction() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "sendMessageGeoLocationAction#176f8ba1";
}
}