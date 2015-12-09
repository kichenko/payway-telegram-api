package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMessagesFilterAudio extends TLAbstractMessagesFilter { 

public static final int CLASS_ID = 0xcfc87522;


public TLInputMessagesFilterAudio() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputMessagesFilterAudio#cfc87522";
}
}