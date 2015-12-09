package com.payway.telegram.api.mtproto.tl.authentication;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * DhGenFailure
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class DhGenFailure extends DhGenResult {

    public static final int CLASS_ID = 0xa69dae02;

    public DhGenFailure(final byte[] nonce, final byte[] serverNonce, final byte[] newNonceHash) {
        super(nonce, serverNonce, newNonceHash);
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }
}
