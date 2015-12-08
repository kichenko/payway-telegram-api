package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUserStatusEmpty extends TLAbstractUserStatus { 

public static final int CLASS_ID = 164646985;


public TLUserStatusEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "userStatusEmpty#164646985";
}
}