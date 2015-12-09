package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLGeoPointEmpty extends TLAbstractGeoPoint { 

public static final int CLASS_ID = 0x1117dd5f;


public TLGeoPointEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "geoPointEmpty#1117dd5f";
}
}