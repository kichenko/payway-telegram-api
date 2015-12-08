package com.payway.telegram.api.tl.schema.help;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public abstract class TLAbstractAppUpdate extends TLObject {

protected int id;
protected boolean critical;
protected String url;
protected String text;

public int getId() {
return id;
}

public void setId(int value) {
this.id = value;
}

public boolean getCritical() {
return critical;
}

public void setCritical(boolean value) {
this.critical = value;
}

public String getUrl() {
return url;
}

public void setUrl(String value) {
this.url = value;
}

public String getText() {
return text;
}

public void setText(String value) {
this.text = value;
}


}