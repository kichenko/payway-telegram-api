package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMessagesFilterPhotoVideo extends TLAbstractMessagesFilter { 

public static final int CLASS_ID = 0x56e9f0e4;


public TLInputMessagesFilterPhotoVideo() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputMessagesFilterPhotoVideo#56e9f0e4";
}
}