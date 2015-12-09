package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputPrivacyKey extends TLObject {

public static final int CLASS_ID = 0x4f96cb18;


public TLInputPrivacyKey() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputPrivacyKeyStatusTimestamp#4f96cb18";
}
}
