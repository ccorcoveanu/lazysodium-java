/*
 * Copyright (c) Terl Tech Ltd • 14/06/19 17:52 • goterl.com
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at http://mozilla.org/MPL/2.0/.
 */

package com.goterl.lazycode.lazysodium;/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import com.goterl.lazycode.lazysodium.exceptions.SodiumException;
import com.goterl.lazycode.lazysodium.utils.Key;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShortHashAndroidTest extends BaseTest {


    @Test
    public void hash() throws SodiumException {
        String hashThis = "This should get hashed";

        Key key = lazySodium.cryptoShortHashKeygen();
        String hash = lazySodium.cryptoShortHash(hashThis, key);

        assertNotNull(hash);
    }



}