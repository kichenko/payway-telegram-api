package com.payway.telegram.api.mtproto.tl.core;

import com.payway.telegram.api.tl.core.TLContext;
import com.payway.telegram.api.tl.core.TLObject;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.readInt;
import static com.payway.telegram.api.tl.core.utils.StreamingUtils.writeInt;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * MTMessagesContainer
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class MTMessagesContainer extends TLObject {

    public static final int CLASS_ID = 0x73f1f8dc;

    //TODO:
    protected TreeSet<MTMessage> messages = new TreeSet<>(new Comparator<MTMessage>() {
        @Override
        public int compare(MTMessage left, MTMessage right) {
            return (int) Math.signum(left.getMsgId() - right.getMsgId());
        }
    });

    public MTMessagesContainer(final MTMessage[] messages) {
        Collections.addAll(this.messages, messages);
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public void serializeBody(final OutputStream stream) throws IOException {
        writeInt(messages.size(), stream);
        for (MTMessage message : messages) {
            message.serializeBody(stream);
        }
    }

    @Override
    public void deserializeBody(final InputStream stream, final TLContext context) throws IOException {
        final int size = readInt(stream);
        messages.clear();
        for (int i = 0; i < size; i++) {
            final MTMessage message = new MTMessage();
            message.deserializeBody(stream, context);
            messages.add(message);
        }
    }
}
