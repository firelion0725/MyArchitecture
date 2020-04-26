package com.leo.thirdlib.location

import android.content.Context
import com.baidu.location.BDAbstractLocationListener
import com.baidu.location.BDLocation
import com.baidu.location.LocationClient
import com.baidu.location.LocationClientOption

/**
 * @author Leo.ZhangTJ
 * @time 2020/4/26
 * @function
 * @describe
 */

class BaiduLocation(var context: Context?) : LocationModule {
    private var client: LocationClient? = null

    private fun initOption(ms: Int): LocationClientOption {
        val option = LocationClientOption()
        option.locationMode = LocationClientOption.LocationMode.Hight_Accuracy
        option.setScanSpan(0)
        option.isOpenGps = true
        option.setIgnoreKillProcess(false)
        option.SetIgnoreCacheException(false)
        option.setWifiCacheTimeOut(5 * 60 * 1000)
        option.setEnableSimulateGps(false)
        option.setNeedNewVersionRgc(true)
        return option
    }

    override fun init(ms: Int, callback: (BDLocation?) -> Unit) {
        client = LocationClient(context)
        val option = initOption(ms)
        client?.locOption = option
        client?.registerLocationListener(object : BDAbstractLocationListener() {
            override fun onReceiveLocation(location: BDLocation?) {
                callback(location)
            }
        })
    }

    override fun start() {
        client?.start()
    }

    override fun stop() {
        client?.stop()
    }

}