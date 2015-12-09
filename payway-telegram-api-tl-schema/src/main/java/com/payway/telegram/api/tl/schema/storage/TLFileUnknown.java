package com.payway.telegram.api.tl.schema.storage;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLFileUnknown extends TLAbstractFileType { 

public static final int CLASS_ID = 0xaa963b05;


public TLFileUnknown() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "storage.fileUnknown#aa963b05";
}
}