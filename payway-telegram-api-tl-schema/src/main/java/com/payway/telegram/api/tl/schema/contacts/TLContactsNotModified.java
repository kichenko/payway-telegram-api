package com.payway.telegram.api.tl.schema.contacts;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLContactsNotModified extends TLAbstractContacts { 

public static final int CLASS_ID = 0xb74ba9d2;


public TLContactsNotModified() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "contacts.contactsNotModified#b74ba9d2";
}
}