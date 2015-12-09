package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPrivacyValueDisallowAll extends TLAbstractPrivacyRule { 

public static final int CLASS_ID = 0x8b73e763;


public TLPrivacyValueDisallowAll() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "privacyValueDisallowAll#8b73e763";
}
}