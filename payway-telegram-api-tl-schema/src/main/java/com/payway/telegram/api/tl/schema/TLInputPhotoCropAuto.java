package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputPhotoCropAuto extends TLAbstractInputPhotoCrop { 

public static final int CLASS_ID = 0xade6b004;


public TLInputPhotoCropAuto() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputPhotoCropAuto#ade6b004";
}
}