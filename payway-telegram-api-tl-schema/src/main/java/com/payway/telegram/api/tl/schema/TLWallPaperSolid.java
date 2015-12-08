package com.payway.telegram.api.tl.schema;

import com.payway.telegram.api.tl.core.*;
import java.io.*;

import com.payway.telegram.api.tl.core.utils.*;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.*;

public class TLWallPaperSolid extends TLAbstractWallPaper { 

public static final int CLASS_ID = 1662091044;

protected int bgColor;

public TLWallPaperSolid() {}

public TLWallPaperSolid (int id, String title, int bgColor, int color) {
this.id = id;
this.title = title;
this.bgColor = bgColor;
this.color = color;
}

public int getClassId() {
return CLASS_ID;
}
public int getBgColor() {
return bgColor;
}

public void setBgColor(int value) {
this.bgColor = value;
}


@Override
public void serializeBody(OutputStream stream) throws IOException {
writeInt(this.id, stream);
writeTLString(this.title, stream);
writeInt(this.bgColor, stream);
writeInt(this.color, stream);
}

@Override
public void deserializeBody(InputStream stream, TLContext context) throws IOException {
this.id = readInt(stream);
this.title = readTLString(stream);
this.bgColor = readInt(stream);
this.color = readInt(stream);
}

@Override
public String toString() {
return "wallPaperSolid#1662091044";
}
}