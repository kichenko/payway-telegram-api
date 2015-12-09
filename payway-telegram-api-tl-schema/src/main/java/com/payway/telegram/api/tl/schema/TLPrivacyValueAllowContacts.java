package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPrivacyValueAllowContacts extends TLAbstractPrivacyRule { 

public static final int CLASS_ID = 0xfffe1bac;


public TLPrivacyValueAllowContacts() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "privacyValueAllowContacts#fffe1bac";
}
}