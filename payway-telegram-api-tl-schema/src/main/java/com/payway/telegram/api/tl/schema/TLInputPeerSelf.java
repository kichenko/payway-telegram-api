package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputPeerSelf extends TLAbstractInputPeer { 

public static final int CLASS_ID = 2107670217;


public TLInputPeerSelf() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputPeerSelf#2107670217";
}
}