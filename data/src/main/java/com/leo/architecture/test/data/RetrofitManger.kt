package com.leo.architecture.test.data

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @author Leo.ZhangTJ
 * @time 2020/4/14
 * @function
 * @describe
 */
object RetrofitManger {

    private const val baseUrl = "https://gank.io/api/"

    val instance: Retrofit = create()

    fun create(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(OkHttpManger.instance)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}