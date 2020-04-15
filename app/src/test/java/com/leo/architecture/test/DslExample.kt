package com.leo.architecture.test

import kotlin.time.ExperimentalTime
import kotlin.time.days

/**
 * @author Leo.ZhangTJ
 * @time 2020/4/15
 * @function
 * @describe
 */

class DslExample {
    @ExperimentalTime
    val secondsInDay = 1.days.inSeconds
}