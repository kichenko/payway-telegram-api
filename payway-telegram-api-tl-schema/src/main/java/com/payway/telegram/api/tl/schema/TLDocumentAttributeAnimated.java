package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLDocumentAttributeAnimated extends TLAbstractDocumentAttribute { 

public static final int CLASS_ID = 0x11b58939;


public TLDocumentAttributeAnimated() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "documentAttributeAnimated#11b58939";
}
}