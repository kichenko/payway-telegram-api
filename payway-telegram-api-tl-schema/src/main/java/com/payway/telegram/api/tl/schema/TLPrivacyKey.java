package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLPrivacyKey extends TLObject {

public static final int CLASS_ID = 0xbc2eab30;


public TLPrivacyKey() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "privacyKeyStatusTimestamp#bc2eab30";
}
}
