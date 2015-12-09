package com.payway.telegram.api.tl.schema.storage;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLFilePartial extends TLAbstractFileType { 

public static final int CLASS_ID = 0x40bc6f52;


public TLFilePartial() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "storage.filePartial#40bc6f52";
}
}