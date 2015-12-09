package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLEncryptedFileEmpty extends TLAbstractEncryptedFile { 

public static final int CLASS_ID = 0xc21f497e;


public TLEncryptedFileEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "encryptedFileEmpty#c21f497e";
}
}