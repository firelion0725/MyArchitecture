package com.leo.architecture.test.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type


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
        viewModel = createBindingWithVm()
        binding = createBinding(root);
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        lifecycle.addObserver(viewModel)
        binding.lifecycleOwner = this
    }

    override fun onDestroy() {
        lifecycle.removeObserver(viewModel)
        super.onDestroy()
    }

    private fun createBindingWithVm(): VM {
        val classType: Class<VM>
        val superClass: Type = javaClass.genericSuperclass
        val type = (superClass as ParameterizedType).actualTypeArguments[1]
        classType = if (type is ParameterizedType) {
            type.rawType as Class<VM>
        } else {
            type as Class<VM>
        }

        return classType.newInstance()
    }

    abstract fun getLayoutId(): Int
    abstract fun createBinding(v: View): VBD
}