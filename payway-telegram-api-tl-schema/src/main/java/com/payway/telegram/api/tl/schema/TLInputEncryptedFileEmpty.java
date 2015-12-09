package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputEncryptedFileEmpty extends TLAbstractInputEncryptedFile { 

public static final int CLASS_ID = 0x1837c364;


public TLInputEncryptedFileEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputEncryptedFileEmpty#1837c364";
}
}