package com.leo.architecture.test.ui.home

import android.os.Bundle
import android.util.Log
import com.baidu.location.BDLocation
import com.leo.architecture.test.R
import com.leo.architecture.test.databinding.FragmentHomeBinding
import com.leo.architecture.test.ndk.TestNdk
import com.leo.architecture.test.ui.base.BaseArchitectureFragment
import com.leo.thirdlib.aspectj.annotation.Record
import com.leo.thirdlib.location.LocationModule


class HomeFragment : BaseArchitectureFragment<FragmentHomeBinding, HomeViewModel>() {

    lateinit var locationClient: LocationModule

    override fun getLayoutId(): Int {
        return R.layout.fragment_home
    }

    @Record
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        viewModel.setMessageText("welcome")
        viewModel?.setMessageText(TestNdk.getStringFromC()+TestNdk.getSum(2,9))

//        locationClient = BaiduLocation(this.activity?.applicationContext)
//        locationClient.init(1000, this::saveLocation)
//        locationClient.start()

        val leakThread = LeakThread()
        leakThread.start()
    }

    override fun onDestroy() {
//        locationClient.stop()
        super.onDestroy()
    }

    private fun saveLocation(location: BDLocation?) {

    }

    internal class LeakThread : Thread() {
        override fun run() {
            try {
                Log.i("aaaaaaaaaaaaaaaaa","aaaaaaaaaaaa")
                sleep(6 * 60 * 1000.toLong())
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }
    }
}
