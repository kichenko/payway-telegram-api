package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public abstract class TLAbstractWallPaper extends TLObject {

protected int id;
protected String title;
protected com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractPhotoSize> sizes;
protected int color;

public int getId() {
return id;
}

public void setId(int value) {
this.id = value;
}

public String getTitle() {
return title;
}

public void setTitle(String value) {
this.title = value;
}

public com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractPhotoSize> getSizes() {
return sizes;
}

public void setSizes(com.payway.telegram.api.tl.core.TLVector<com.payway.telegram.api.tl.schema.TLAbstractPhotoSize> value) {
this.sizes = value;
}

public int getColor() {
return color;
}

public void setColor(int value) {
this.color = value;
}


}