package com.payway.telegram.api.mtproto.tl.authentication;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * DhGenRetry
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class DhGenRetry extends DhGenResult {

    public static final int CLASS_ID = 0x46dc1fb9;

    public DhGenRetry(final byte[] nonce, final byte[] serverNonce, final byte[] newNonceHash) {
        super(nonce, serverNonce, newNonceHash);
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }
}
