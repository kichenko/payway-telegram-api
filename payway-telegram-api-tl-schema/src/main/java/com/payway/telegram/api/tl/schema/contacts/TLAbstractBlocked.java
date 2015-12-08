package com.payway.telegram.api.tl.schema.contacts;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public abstract class TLAbstractBlocked extends TLObject {

protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLContactBlocked> blocked;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users;

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLContactBlocked> getBlocked() {
return blocked;
}

public void setBlocked(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLContactBlocked> value) {
this.blocked = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> getUsers() {
return users;
}

public void setUsers(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> value) {
this.users = value;
}


}