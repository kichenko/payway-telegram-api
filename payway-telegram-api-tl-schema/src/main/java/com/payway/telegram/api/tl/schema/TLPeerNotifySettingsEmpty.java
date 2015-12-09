package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPeerNotifySettingsEmpty extends TLAbstractPeerNotifySettings { 

public static final int CLASS_ID = 0x70a68512;


public TLPeerNotifySettingsEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "peerNotifySettingsEmpty#70a68512";
}
}