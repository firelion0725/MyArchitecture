package com.leo.architecture.test

import android.app.Application
import com.leo.architecture.test.data.DataManger

/**
 * @author Leo.ZhangTJ
 * @time 2020/4/14
 * @function
 * @describe
 */

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        DataManger.initData(this)
    }
}