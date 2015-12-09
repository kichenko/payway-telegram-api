package com.payway.telegram.api.tl.schema.contacts;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLForeignLinkUnknown extends TLAbstractForeignLink { 

public static final int CLASS_ID = 0x133421f8;


public TLForeignLinkUnknown() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "contacts.foreignLinkUnknown#133421f8";
}
}