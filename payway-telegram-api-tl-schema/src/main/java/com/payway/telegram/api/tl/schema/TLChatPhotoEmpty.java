package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLChatPhotoEmpty extends TLAbstractChatPhoto { 

public static final int CLASS_ID = 935395612;


public TLChatPhotoEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "chatPhotoEmpty#935395612";
}
}