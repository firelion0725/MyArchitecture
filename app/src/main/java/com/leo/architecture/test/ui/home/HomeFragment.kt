package com.leo.architecture.test.ui.home

import android.os.Bundle
import com.baidu.location.BDLocation
import com.leo.architecture.test.R
import com.leo.architecture.test.databinding.FragmentHomeBinding
import com.leo.architecture.test.databinding.FragmentHomeBindingImpl
import com.leo.architecture.test.ui.base.BaseArchitectureFragment
import com.leo.thirdlib.location.BaiduLocation
import com.leo.thirdlib.location.LocationModule

class HomeFragment : BaseArchitectureFragment<FragmentHomeBinding, HomeViewModel>() {

    lateinit var locationClient: LocationModule

    override fun getLayoutId(): Int {
        return R.layout.fragment_home
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.setMessageText("welcome")

        locationClient = BaiduLocation(this.activity?.applicationContext)
        locationClient.init(1000) { location ->
            saveLocation(location)
        }

        locationClient.start()
    }

    override fun onDestroy() {
        locationClient.stop()
        super.onDestroy()
    }

    private fun saveLocation(location: BDLocation?) {

    }

}
