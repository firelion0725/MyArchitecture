package com.leo.architecture.test.ui.home

import android.os.Bundle
import android.view.View
import com.leo.architecture.test.R
import com.leo.architecture.test.databinding.FragmentHomeBinding
import com.leo.architecture.test.ui.base.BaseArchitectureFragment

class HomeFragment : BaseArchitectureFragment<FragmentHomeBinding, HomeViewModel>() {

    override fun getLayoutId(): Int {
        return R.layout.fragment_home
    }

    override fun createBinding(v: View): FragmentHomeBinding {
        return FragmentHomeBinding.bind(v)
    }

    override fun createViewModel(): HomeViewModel {
        return getViewModel(HomeViewModel::class.java)
    }

    override fun bindingWithViewModel() {
        binding.viewModel = viewModel
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.setMessageText("welcome")
    }

}
