package com.payway.telegram.api.tl.schema.contacts;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMyLinkContact extends TLAbstractMyLink { 

public static final int CLASS_ID = -1035932711;


public TLMyLinkContact() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "contacts.myLinkContact#-1035932711";
}
}