package com.leo.architecture.test.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.leo.architecture.test.R
import com.leo.architecture.test.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_dashboard.*

class DashboardFragment : BaseFragment() {

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        dashboardViewModel = getViewModel(DashboardViewModel::class.java)
        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
            text_dashboard.text = it
        })
    }
}
