package com.leo.architecture.test.ui.dashboard

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.leo.architecture.test.R
import com.leo.architecture.test.databinding.FragmentDashboardBinding
import com.leo.architecture.test.ui.base.BaseArchitectureFragment
import com.leo.thirdlib.glide.GlideApp
import kotlinx.android.synthetic.main.fragment_dashboard.*

class DashboardFragment : BaseArchitectureFragment<FragmentDashboardBinding, DashboardViewModel>() {

    private val url =
        "https://dss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2868081268,3128738317&fm=26&gp=0.jpg"

    override fun getLayoutId(): Int {
        return R.layout.fragment_dashboard
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        GlideApp.with(this)
            .load(url)
            .fitCenter()
            .into(image);
    }

    //自己去定制viewmodel 初始化
    override fun setViewModel() {
        activity?.let {
            viewModel = ViewModelProvider(
                this,
                ViewModelProvider.AndroidViewModelFactory(it.application)
            ).get(DashboardViewModel::class.java)
        }
    }
}
