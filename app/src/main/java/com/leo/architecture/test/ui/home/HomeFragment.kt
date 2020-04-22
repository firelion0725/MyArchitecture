package com.leo.architecture.test.ui.home

import android.os.Bundle
import android.view.View
import com.leo.architecture.test.R
import com.leo.architecture.test.databinding.FragmentHomeBinding
import com.leo.architecture.test.databinding.FragmentHomeBindingImpl
import com.leo.architecture.test.ui.base.BaseArchitectureFragment

class HomeFragment : BaseArchitectureFragment<FragmentHomeBindingImpl, HomeViewModel>() {

    override fun getLayoutId(): Int {
        return R.layout.fragment_home
    }

//    override fun createBinding(v: View): FragmentHomeBindingImpl {
//        val binding = FragmentHomeBinding.bind(v) as FragmentHomeBindingImpl
//        binding.viewModel = viewModel
//        return binding
//    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.viewModel = viewModel
        viewModel.setMessageText("welcome")
    }

}
