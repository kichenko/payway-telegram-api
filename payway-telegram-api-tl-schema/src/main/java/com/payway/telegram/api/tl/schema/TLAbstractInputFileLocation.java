package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public abstract class TLAbstractInputFileLocation extends TLObject {

protected long volumeId;
protected int localId;
protected long secret;

public long getVolumeId() {
return volumeId;
}

public void setVolumeId(long value) {
this.volumeId = value;
}

public int getLocalId() {
return localId;
}

public void setLocalId(int value) {
this.localId = value;
}

public long getSecret() {
return secret;
}

public void setSecret(long value) {
this.secret = value;
}


}