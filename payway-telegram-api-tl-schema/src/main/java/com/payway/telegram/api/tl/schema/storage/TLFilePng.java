package com.payway.telegram.api.tl.schema.storage;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLFilePng extends TLAbstractFileType { 

public static final int CLASS_ID = 0xa4f63c0;


public TLFilePng() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "storage.filePng#a4f63c0";
}
}