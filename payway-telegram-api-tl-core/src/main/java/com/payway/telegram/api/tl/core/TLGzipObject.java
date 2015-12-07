package com.payway.telegram.api.tl.core;

import com.payway.telegram.api.tl.core.utils.StreamingUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Basic class of gzipped object
 *
 * @author
 * @created 07.12.2015
 */
public class TLGzipObject extends TLObject {

    private static final long serialVersionUID = 5633519966529108459L;

    public static final int CLASS_ID = 0x3072CFA1;

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    public TLGzipObject(byte[] packedData) {
        this.packedData = packedData;
    }

    public TLGzipObject() {

    }

    private byte[] packedData;

    public byte[] getPackedData() {
        return packedData;
    }

    public void setPackedData(byte[] packedData) {
        this.packedData = packedData;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        StreamingUtils.writeTLBytes(packedData, stream);
    }

    @Override
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        packedData = StreamingUtils.readTLBytes(stream);
    }

    @Override
    public String toString() {
        return "gzip_packed#3072cfa1";
    }
}
