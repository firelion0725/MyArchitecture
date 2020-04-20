package com.leo.architecture.test.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding

/**
 * @author Leo.ZhangTJ
 * @time 2020/4/14
 * @function
 * @describe
 */

abstract class BaseArchitectureFragment<VBD : ViewDataBinding, VM : BaseViewModel> :
    BaseFragment() {

    protected lateinit var binding: VBD
    protected lateinit var viewModel: VM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(getLayoutId(), container, false)
        binding = createBinding(root);
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = createViewModel()
        bindingWithViewModel()
        lifecycle.addObserver(viewModel)
        binding.lifecycleOwner = this
    }

    override fun onDestroy() {
        lifecycle.removeObserver(viewModel)
        super.onDestroy()
    }

    abstract fun getLayoutId(): Int
    abstract fun createBinding(v: View): VBD
    abstract fun createViewModel(): VM
    abstract fun bindingWithViewModel()
}