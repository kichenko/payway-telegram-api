package com.payway.telegram.api.tl.schema.contacts;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLForeignLinkMutual extends TLAbstractForeignLink { 

public static final int CLASS_ID = 0x1bea8ce1;


public TLForeignLinkMutual() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "contacts.foreignLinkMutual#1bea8ce1";
}
}