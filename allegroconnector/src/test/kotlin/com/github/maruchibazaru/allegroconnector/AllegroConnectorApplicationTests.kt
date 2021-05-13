package com.github.maruchibazaru.allegroconnector

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class AllegroConnectorApplicationTests {

    @Test
    fun contextLoads() {
        Assertions.assertEquals(2147483646, Integer.sum(2147183646, 300000));
    }

}
