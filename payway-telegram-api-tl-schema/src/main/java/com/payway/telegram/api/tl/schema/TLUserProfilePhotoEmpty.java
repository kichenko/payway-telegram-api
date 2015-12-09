package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLUserProfilePhotoEmpty extends TLAbstractUserProfilePhoto { 

public static final int CLASS_ID = 0x4f11bae1;


public TLUserProfilePhotoEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "userProfilePhotoEmpty#4f11bae1";
}
}