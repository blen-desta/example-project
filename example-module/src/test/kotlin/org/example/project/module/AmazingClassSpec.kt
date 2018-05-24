package org.example.project.module

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class AmazingClassSpec : StringSpec() {
    init {

        "Correct addition test"{
            val result = AmazingClass().amazingAddition(2, 1)
            result shouldBe 3
        }

        "Failing addition test"{
            val result = AmazingClass().amazingAddition(2, 1)
            result shouldBe 55
        }

        "Correct subtraction test"{
            val result = AmazingClass().amazingSubtraction(2, 1)
            result shouldBe 1
        }

        "Failing subtraction test"{
            val result = AmazingClass().amazingSubtraction(2, 1)
            result shouldBe 55
        }
    }
}