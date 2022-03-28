package org.pang.bian

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class AppTest : StringSpec({
    "Pluralize returns singular when count is 1" {
        val result = pluralize(1, "dog", "dogs")

        result shouldBe "dog"
    }
})
