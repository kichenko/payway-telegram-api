package com.payway.telegram.api.tl.schema.help;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLNoAppUpdate extends TLAbstractAppUpdate { 

public static final int CLASS_ID = -1000708810;


public TLNoAppUpdate() {}


public int getClassId() {
return CLASS_ID;
}



@Override
public String toString() {
return "help.noAppUpdate#-1000708810";
}
}