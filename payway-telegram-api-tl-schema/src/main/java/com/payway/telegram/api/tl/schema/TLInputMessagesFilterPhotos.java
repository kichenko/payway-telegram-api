package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMessagesFilterPhotos extends TLAbstractMessagesFilter { 

public static final int CLASS_ID = 0x9609a51c;


public TLInputMessagesFilterPhotos() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputMessagesFilterPhotos#9609a51c";
}
}