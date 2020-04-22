package com.leo.architecture.test.ui.home

import android.os.Bundle
import com.leo.architecture.test.R
import com.leo.architecture.test.databinding.FragmentHomeBinding
import com.leo.architecture.test.ui.base.BaseArchitectureFragment

class HomeFragment : BaseArchitectureFragment<FragmentHomeBinding, HomeViewModel>() {

    override fun getLayoutId(): Int {
        return R.layout.fragment_home
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.setMessageText("welcome")
    }

}
