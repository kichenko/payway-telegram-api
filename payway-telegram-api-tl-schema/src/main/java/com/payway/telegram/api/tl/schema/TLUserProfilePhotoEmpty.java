package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUserProfilePhotoEmpty extends TLAbstractUserProfilePhoto { 

public static final int CLASS_ID = 1326562017;


public TLUserProfilePhotoEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "userProfilePhotoEmpty#1326562017";
}
}