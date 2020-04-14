package com.leo.architecture.test.data

import com.readystatesoftware.chuck.BuildConfig
import com.readystatesoftware.chuck.ChuckInterceptor
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

/**
 * @author Leo.ZhangTJ
 * @time 2020/4/14
 * @function
 * @describe
 */

object OkHttpManger {


    private const val TIME_OUT: Long = 120

    val instance: OkHttpClient = getHttpClient()

    private fun getHttpClient(): OkHttpClient {
        val builder: OkHttpClient.Builder =
            OkHttpClient.Builder()
                .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
                .readTimeout(TIME_OUT, TimeUnit.SECONDS)
                .writeTimeout(TIME_OUT, TimeUnit.SECONDS)
        if (BuildConfig.DEBUG) {
            builder.addInterceptor(ChuckInterceptor(DataManger.getApplication()))
        }
        return builder.build()
    }


}