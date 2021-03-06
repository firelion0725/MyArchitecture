package com.leo.architecture.test.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.leo.architecture.test.R
import com.leo.architecture.test.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_notifications.*

class NotificationsFragment : BaseFragment() {

    private lateinit var notificationsViewModel: NotificationsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_notifications, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        notificationsViewModel = getViewModel(NotificationsViewModel::class.java)
        notificationsViewModel.text.observe(viewLifecycleOwner, Observer {
            motion_layout.transitionToEnd()
        })
    }
}
