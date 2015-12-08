package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputUserEmpty extends TLAbstractInputUser { 

public static final int CLASS_ID = -1182234929;


public TLInputUserEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputUserEmpty#-1182234929";
}
}