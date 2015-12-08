package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public abstract class TLAbstractInputFile extends TLObject {

protected long id;
protected int parts;
protected String name;
protected String md5Checksum;

public long getId() {
return id;
}

public void setId(long value) {
this.id = value;
}

public int getParts() {
return parts;
}

public void setParts(int value) {
this.parts = value;
}

public String getName() {
return name;
}

public void setName(String value) {
this.name = value;
}

public String getMd5Checksum() {
return md5Checksum;
}

public void setMd5Checksum(String value) {
this.md5Checksum = value;
}


}