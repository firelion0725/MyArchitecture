package com.leo.architecture.test.ui.base

import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.NewInstanceFactory

/**
 * @author Leo.ZhangTJ
 * @time 2020/4/14
 * @function
 * @describe
 */

open class BaseFragment : Fragment() {

    private var sInstance: NewInstanceFactory? = null
    fun getViewModelInstance(): NewInstanceFactory {
        if (sInstance == null) {
            sInstance = ViewModelProvider.NewInstanceFactory();
        }
        return sInstance as NewInstanceFactory;
    }

    fun <T : ViewModel> getViewModel(@NonNull modelClass: Class<T>): T {
        return getViewModelInstance().create(modelClass)
    }

}