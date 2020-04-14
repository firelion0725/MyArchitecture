package com.leo.architecture.test.data

import android.app.Application

/**
 * @author Leo.ZhangTJ
 * @time 2020/4/14
 * @function
 * @describe
 */

object DataManger {


    private lateinit var application: Application

    fun initData(application: Application) {
        this.application = application;
    }

    fun getApplication(): Application {
        return application;
    }


}