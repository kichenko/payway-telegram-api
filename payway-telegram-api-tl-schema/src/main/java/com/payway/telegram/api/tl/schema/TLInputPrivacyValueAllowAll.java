package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputPrivacyValueAllowAll extends TLAbstractInputPrivacyRule { 

public static final int CLASS_ID = 0x184b35ce;


public TLInputPrivacyValueAllowAll() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputPrivacyValueAllowAll#184b35ce";
}
}