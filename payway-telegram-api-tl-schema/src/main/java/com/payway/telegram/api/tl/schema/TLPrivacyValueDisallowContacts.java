package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPrivacyValueDisallowContacts extends TLAbstractPrivacyRule { 

public static final int CLASS_ID = 0xf888fa1a;


public TLPrivacyValueDisallowContacts() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "privacyValueDisallowContacts#f888fa1a";
}
}