package com.payway.telegram.api.tl.schema.storage;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLFileMp4 extends TLAbstractFileType { 

public static final int CLASS_ID = -1278304028;


public TLFileMp4() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "storage.fileMp4#-1278304028";
}
}