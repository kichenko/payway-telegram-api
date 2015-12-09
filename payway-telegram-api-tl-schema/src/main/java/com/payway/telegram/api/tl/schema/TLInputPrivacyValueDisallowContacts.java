package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputPrivacyValueDisallowContacts extends TLAbstractInputPrivacyRule { 

public static final int CLASS_ID = 0xba52007;


public TLInputPrivacyValueDisallowContacts() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputPrivacyValueDisallowContacts#ba52007";
}
}