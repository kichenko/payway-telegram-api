package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputPrivacyValueDisallowAll extends TLAbstractInputPrivacyRule { 

public static final int CLASS_ID = 0xd66b66c9;


public TLInputPrivacyValueDisallowAll() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputPrivacyValueDisallowAll#d66b66c9";
}
}