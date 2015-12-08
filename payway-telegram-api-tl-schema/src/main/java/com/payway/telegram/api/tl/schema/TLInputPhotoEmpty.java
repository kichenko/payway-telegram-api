package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputPhotoEmpty extends TLAbstractInputPhoto { 

public static final int CLASS_ID = 483901197;


public TLInputPhotoEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputPhotoEmpty#483901197";
}
}