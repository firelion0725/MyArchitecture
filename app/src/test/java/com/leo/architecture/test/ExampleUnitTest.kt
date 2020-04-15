package com.leo.architecture.test

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * 测试了一些高阶函数写法
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun t() {
//        test { paramFun2() }
//        println("${test2("aaaaaaaaa").invoke("aaaaaaaaa")}")
//        println("${test2("aaaaaaa243534aa").invoke("aaaaaaa243534aa")}")

//        println("${test3("aaaaaaaaa").invoke("aaaaaaaaa").invoke()}")
//        println("${test3("aaaaaaa243534aa").invoke("aaaaaaa243534aa").invoke()}")

        println(test4{
            paramFun2()
        }.invoke( paramFun2()))
    }

    private fun test4(p: () -> Int): (Int) -> String {
        return fun(p): String {
            return if (p > 100) {
                "so  big"
            } else {
                "so so "
            }
        }
    }

    private fun test2(p: String): (String) -> Int {
        return fun(p): Int {
            if (p == "aaaaaaaaa") {
                return 800
            }
            return 35
        }
    }

    private fun test3(p: String): (String) -> () -> Int {
        return fun(p): () -> Int {
            if (p == "aaaaaaaaa") {
                return fun(): Int { return 800 }
            }
            return fun(): Int { return 35 }
        }
    }

    private fun test(p: () -> Int) {
        print("${p.invoke()}")
    }

    fun paramFun(): String {
        return "aaaaa"
    }

    fun paramFun2(): Int {
        return 99
    }
}
