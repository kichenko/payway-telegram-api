package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMessagesFilterPhotoVideo extends TLAbstractMessagesFilter { 

public static final int CLASS_ID = 1458172132;


public TLInputMessagesFilterPhotoVideo() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputMessagesFilterPhotoVideo#1458172132";
}
}