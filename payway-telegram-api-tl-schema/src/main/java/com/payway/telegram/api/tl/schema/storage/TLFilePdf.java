package com.payway.telegram.api.tl.schema.storage;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLFilePdf extends TLAbstractFileType { 

public static final int CLASS_ID = 0xae1e508d;


public TLFilePdf() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "storage.filePdf#ae1e508d";
}
}