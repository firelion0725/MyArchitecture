package com.leo.architecture.test.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.leo.architecture.test.R
import com.leo.architecture.test.databinding.FragmentHomeBinding
import com.leo.architecture.test.ui.base.BaseFragment

class HomeFragment : BaseFragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var viewDataBinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        viewDataBinding = FragmentHomeBinding.bind(root)
        return viewDataBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        homeViewModel = getViewModel(HomeViewModel::class.java)
        lifecycle.addObserver(homeViewModel)
        viewDataBinding.homeViewModel = homeViewModel
        viewDataBinding.lifecycleOwner = this
        homeViewModel.setMessageText("welcome home")
    }

    override fun onDestroy() {
        lifecycle.removeObserver(homeViewModel)
        super.onDestroy()
    }
}
