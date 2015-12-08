package com.payway.telegram.api.tl.schema.messages;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public abstract class TLAbstractStatedMessage extends TLObject {

protected com.payway.telegram.api.tl.schema.TLAbstractMessage message;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractChat> chats;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> users;
protected int pts;
protected int seq;

public com.payway.telegram.api.tl.schema.TLAbstractMessage getMessage() {
return message;
}

public void setMessage(com.payway.telegram.api.tl.schema.TLAbstractMessage value) {
this.message = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractChat> getChats() {
return chats;
}

public void setChats(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractChat> value) {
this.chats = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> getUsers() {
return users;
}

public void setUsers(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractUser> value) {
this.users = value;
}

public int getPts() {
return pts;
}

public void setPts(int value) {
this.pts = value;
}

public int getSeq() {
return seq;
}

public void setSeq(int value) {
this.seq = value;
}


}