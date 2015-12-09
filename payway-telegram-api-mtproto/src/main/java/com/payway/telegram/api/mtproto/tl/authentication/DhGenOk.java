package com.payway.telegram.api.mtproto.tl.authentication;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * DhGenOk
 *
 * @author
 * @created 09.12.2015
 */
@Getter
@NoArgsConstructor
public class DhGenOk extends DhGenResult {

    public static final int CLASS_ID = 0x3bcbf734;

    public DhGenOk(final byte[] nonce, final byte[] serverNonce, final byte[] newNonceHash) {
        super(nonce, serverNonce, newNonceHash);
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }
}
