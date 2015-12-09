package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputMessagesFilterAudioDocuments extends TLAbstractMessagesFilter { 

public static final int CLASS_ID = 0x5afbf764;


public TLInputMessagesFilterAudioDocuments() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputMessagesFilterAudioDocuments#5afbf764";
}
}