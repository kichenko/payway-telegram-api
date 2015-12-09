package com.payway.telegram.api.tl.schema.contacts;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLMyLinkEmpty extends TLAbstractMyLink { 

public static final int CLASS_ID = 0xd22a1c60;


public TLMyLinkEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "contacts.myLinkEmpty#d22a1c60";
}
}