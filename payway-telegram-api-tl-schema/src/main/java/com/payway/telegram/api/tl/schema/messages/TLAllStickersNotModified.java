package com.payway.telegram.api.tl.schema.messages;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLAllStickersNotModified extends TLAbstractAllStickers { 

public static final int CLASS_ID = 0xe86602c3;


public TLAllStickersNotModified() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "messages.allStickersNotModified#e86602c3";
}
}