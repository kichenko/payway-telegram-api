package com.payway.telegram.api.tl.schema.messages;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLStickersNotModified extends TLAbstractStickers { 

public static final int CLASS_ID = 0xf1749a22;


public TLStickersNotModified() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "messages.stickersNotModified#f1749a22";
}
}