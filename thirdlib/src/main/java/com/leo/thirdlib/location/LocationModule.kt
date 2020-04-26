package com.leo.thirdlib.location

import android.content.Context
import com.baidu.location.BDLocation

/**
 * @author Leo.ZhangTJ
 * @time 2020/4/26
 * @function
 * @describe
 */
interface LocationModule {

    fun init( ms: Int, callback: (BDLocation?) -> Unit)

    fun start()

    fun stop()

}