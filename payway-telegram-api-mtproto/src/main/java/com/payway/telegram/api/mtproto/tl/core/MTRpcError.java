package com.payway.telegram.api.mtproto.tl.core;

import com.payway.telegram.api.tl.core.TLContext;
import com.payway.telegram.api.tl.core.TLObject;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readInt;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readTLString;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeInt;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeTLString;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 * MTRpcError
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class MTRpcError extends TLObject {

    public static final int CLASS_ID = 0x2144ca19;

    private static final Pattern REGEXP_PATTERN = Pattern.compile("[A-Z_0-9]+");

    protected int errorCode;
    protected String errorMessage;

    public MTRpcError(final int errorCode, final String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    //TODO:
    public String getErrorTag() {

        if (StringUtils.isBlank(errorMessage)) {
            return "DEFAULT";
        }

        final Matcher matcher = REGEXP_PATTERN.matcher(errorMessage);
        if (matcher.find()) {
            return matcher.group();
        }

        return "DEFAULT";
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeInt(errorCode, stream);
        writeTLString(errorMessage, stream);
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        errorCode = readInt(stream);
        errorMessage = readTLString(stream);
    }
}
