package com.payway.telegram.api.tl.core;

import com.payway.telegram.api.tl.core.utils.StreamingUtils;
import com.payway.telegram.api.tl.core.exception.DeserializeException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

/**
 * Basic class for all tl-objects. Contains methods for serializing and
 * deserializing object. Each tl-object has class id for using in object header
 * for identifying object class for deserialization. This number might be unique
 * and often equals to crc32 of tl-record of tl-constructor.
 *
 * It is recommended to declare public static final CLASS_ID with tl class id
 * and return this in getClassId and passing it to TLContext.registerClass
 * method during class registration
 *
 * @author
 * @created 07.12.2015
 */
public abstract class TLObject implements Serializable {

    private static final long serialVersionUID = -8440636119099201960L;

    /**
     * Getting TL Class identification
     *
     * @return id of class
     */
    public abstract int getClassId();

    /**
     * Serializing object to byte array
     *
     * @return serialized object with header
     * @throws IOException
     */
    public byte[] serialize() throws IOException {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        serialize(stream);
        return stream.toByteArray();
    }

    /**
     * Serializing object to stream
     *
     * @param stream destination stream
     * @throws IOException
     */
    public void serialize(OutputStream stream) throws IOException {
        StreamingUtils.writeInt(getClassId(), stream);
        serializeBody(stream);
    }

    /**
     * Deserializing object from stream and current TLContext
     *
     * @param stream source stream
     * @param context tl context
     * @throws IOException
     */
    public void deserialize(InputStream stream, TLContext context) throws IOException {
        int classId = StreamingUtils.readInt(stream);
        if (classId != getClassId()) {
            throw new DeserializeException("Wrong class id. Founded:" + Integer.toHexString(classId)
                    + ", expected: " + Integer.toHexString(getClassId()));
        }
        deserializeBody(stream, context);
    }

    /**
     * Serializing object body to stream
     *
     * @param stream destination stream
     * @throws IOException
     */
    public void serializeBody(OutputStream stream) throws IOException {

    }

    /**
     * Deserializing object from stream and context
     *
     * @param stream source stream
     * @param context tl context
     * @throws IOException
     */
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {

    }
}
