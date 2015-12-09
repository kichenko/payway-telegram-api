package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputUserEmpty extends TLAbstractInputUser { 

public static final int CLASS_ID = 0xb98886cf;


public TLInputUserEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputUserEmpty#b98886cf";
}
}