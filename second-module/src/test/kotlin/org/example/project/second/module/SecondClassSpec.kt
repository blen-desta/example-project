package org.example.project.second.module

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class SecondClassSpec : StringSpec() {
    init {

        "Correct multiplication test"{
            val result = SecondClass().amazingMultiplication(2, 1)
            result shouldBe 2
        }

        "Failing multiplication test"{
            val result = SecondClass().amazingMultiplication(2, 1)
            result shouldBe 55
        }

        "Correct division test"{
            val result = SecondClass().amazingDivision(2, 1)
            result shouldBe 2
        }

        "Failing division test"{
            val result = SecondClass().amazingDivision(2, 1)
            result shouldBe 55
        }
    }
}