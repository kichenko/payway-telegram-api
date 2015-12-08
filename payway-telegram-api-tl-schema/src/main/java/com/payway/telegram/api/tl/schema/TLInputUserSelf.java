package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputUserSelf extends TLAbstractInputUser { 

public static final int CLASS_ID = -138301121;


public TLInputUserSelf() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputUserSelf#-138301121";
}
}