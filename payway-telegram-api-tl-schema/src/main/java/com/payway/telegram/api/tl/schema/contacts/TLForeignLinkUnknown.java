package com.payway.telegram.api.tl.schema.contacts;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLForeignLinkUnknown extends TLAbstractForeignLink { 

public static final int CLASS_ID = 322183672;


public TLForeignLinkUnknown() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "contacts.foreignLinkUnknown#322183672";
}
}