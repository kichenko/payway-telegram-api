package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputDocumentEmpty extends TLAbstractInputDocument { 

public static final int CLASS_ID = 0x72f0eaae;


public TLInputDocumentEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputDocumentEmpty#72f0eaae";
}
}