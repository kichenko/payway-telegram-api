package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputPrivacyValueAllowContacts extends TLAbstractInputPrivacyRule { 

public static final int CLASS_ID = 0xd09e07b;


public TLInputPrivacyValueAllowContacts() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputPrivacyValueAllowContacts#d09e07b";
}
}