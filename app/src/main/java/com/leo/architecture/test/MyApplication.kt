package com.leo.architecture.test

import android.app.Application
import com.github.moduth.blockcanary.BlockCanary
import com.github.moduth.blockcanary.BlockCanaryContext
import com.leo.architecture.test.data.DataManger
import com.squareup.leakcanary.LeakCanary

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
        BlockCanary.install(this, AppBlockCanary()).start()
        LeakCanary.install(this)
    }

    class AppBlockCanary : BlockCanaryContext() {
        override fun provideBlockThreshold(): Int {
            return 1000
        }
    }

}