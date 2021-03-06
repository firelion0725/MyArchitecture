package com.leo.architecture.test.data.api

import com.leo.architecture.test.data.RetrofitManger
import com.leo.architecture.test.data.comm.baseUrl
import com.leo.architecture.test.data.comm.singleCompile
import com.leo.architecture.test.data.model.BannerTitleModel
import io.reactivex.Single

/**
 * @author Leo.ZhangTJ
 * @time 2020/4/14
 * @function
 * @describe
 */
object GankApiRepository {


    private val api: GankApi = RetrofitManger.getInstance(baseUrl).create(GankApi::class.java)

    fun getBanners(): Single<BannerTitleModel> {
        return api.getBanners()
    }

}