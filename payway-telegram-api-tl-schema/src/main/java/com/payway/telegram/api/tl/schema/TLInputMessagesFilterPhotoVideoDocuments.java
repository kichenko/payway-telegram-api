package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMessagesFilterPhotoVideoDocuments extends TLAbstractMessagesFilter { 

public static final int CLASS_ID = 0xd95e73bb;


public TLInputMessagesFilterPhotoVideoDocuments() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputMessagesFilterPhotoVideoDocuments#d95e73bb";
}
}