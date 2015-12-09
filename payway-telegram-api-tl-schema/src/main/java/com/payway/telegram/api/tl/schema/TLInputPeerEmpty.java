package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputPeerEmpty extends TLAbstractInputPeer { 

public static final int CLASS_ID = 0x7f3b18ea;


public TLInputPeerEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputPeerEmpty#7f3b18ea";
}
}