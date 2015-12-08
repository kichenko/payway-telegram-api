package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputGeoPointEmpty extends TLAbstractInputGeoPoint { 

public static final int CLASS_ID = -457104426;


public TLInputGeoPointEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputGeoPointEmpty#-457104426";
}
}