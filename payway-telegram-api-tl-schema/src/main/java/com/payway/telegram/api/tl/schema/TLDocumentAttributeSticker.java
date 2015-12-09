package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLDocumentAttributeSticker extends TLAbstractDocumentAttribute { 

public static final int CLASS_ID = 0xfb0a5727;


public TLDocumentAttributeSticker() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "documentAttributeSticker#fb0a5727";
}
}