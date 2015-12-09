package com.payway.telegram.api.tl.schema.storage;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLFileMov extends TLAbstractFileType { 

public static final int CLASS_ID = 0x4b09ebbc;


public TLFileMov() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "storage.fileMov#4b09ebbc";
}
}