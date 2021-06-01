package com.xvitu

import io.ktor.config.*
import io.ktor.server.engine.*

class TestClass {

    fun run (apik: ApplicationConfigValue?): String {
        var c = apik!!.getString()

        return c
    }
}
