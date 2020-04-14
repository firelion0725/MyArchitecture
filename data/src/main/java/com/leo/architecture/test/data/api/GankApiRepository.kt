package com.leo.architecture.test.data.api

import com.leo.architecture.test.data.RetrofitManger
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


    private val api: GankApi = RetrofitManger.instance.create(GankApi::class.java)

    public fun getBanners(): Single<BannerTitleModel> {
        return api.getBanners().compose(singleCompile())
    }

}