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

//        println(test4 {
//            paramFun2()
//        }.invoke(paramFun2()))

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

    fun sum(mulit: Double, num1: Int, num2: Int, add: (Int, Int) -> Int): Double {
        return mulit * add(num1, num2)
    }

    fun sum2(
        mulit: Double,
        num1: Int,
        num2: Int,
        add: (Int, Int) -> Int,
        square: (Int) -> Int
    ): Double {
        return mulit * add(num1, num2) + square(num2)
    }

    @Test
    public fun ttt() {
//        val result1 = sum(0.5, 5, 96) { num1, num2 ->
//            num1 + num2
//        }
//
//        println("$result1")

        val result2 = sum2(0.3, 2, 4,
            { num1, num2 -> num1 + num2 },
            { num2 -> (num2 * num2) })
        println("$result2")
    }


}
