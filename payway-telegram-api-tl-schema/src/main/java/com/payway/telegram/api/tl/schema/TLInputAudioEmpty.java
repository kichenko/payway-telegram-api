package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLInputAudioEmpty extends TLAbstractInputAudio { 

public static final int CLASS_ID = 0xd95adc84;


public TLInputAudioEmpty() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "inputAudioEmpty#d95adc84";
}
}