package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputChatPhotoEmpty extends TLAbstractInputChatPhoto { 

public static final int CLASS_ID = 480546647;


public TLInputChatPhotoEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputChatPhotoEmpty#480546647";
}
}