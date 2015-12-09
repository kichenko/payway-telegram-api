package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPrivacyValueAllowAll extends TLAbstractPrivacyRule { 

public static final int CLASS_ID = 0x65427b82;


public TLPrivacyValueAllowAll() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "privacyValueAllowAll#65427b82";
}
}