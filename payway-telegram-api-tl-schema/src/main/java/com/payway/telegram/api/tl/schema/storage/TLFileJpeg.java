package com.payway.telegram.api.tl.schema.storage;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLFileJpeg extends TLAbstractFileType { 

public static final int CLASS_ID = 8322574;


public TLFileJpeg() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "storage.fileJpeg#8322574";
}
}