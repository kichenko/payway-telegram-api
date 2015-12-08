package com.payway.telegram.api.tl.schema.storage;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLFileMp3 extends TLAbstractFileType { 

public static final int CLASS_ID = 1384777335;


public TLFileMp3() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "storage.fileMp3#1384777335";
}
}