/*
 * Copyright (c) Terl Tech Ltd • 10/05/18 23:39 • goterl.com
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at http://mozilla.org/MPL/2.0/.
 */

/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import com.goterl.lazycode.lazysodium.interfaces.KeyExchange;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class KeyExchangeTest extends BaseTest {


    @Test
    public void generateKeyPair() {

        KeyExchange.KeyPair keys = lazySodium.cryptoKxKeypair();

        System.out.println(keys.getSecretKey());
        System.out.println(keys.getPublicKey());

        assertNotNull(keys);
    }



}
