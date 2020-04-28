package com.leo.architecture.test.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.leo.utils.ScreenUtils

/**
 * @author Leo.ZhangTJ
 * @time 2020/4/27
 * @function
 * @describe
 */
abstract class BaseActivity : AppCompatActivity() {

    private val targetDp = 360

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        ScreenUtils.adapterScreen(this, targetDp, false)
        setContentView(getLayoutId())
    }

    abstract fun getLayoutId(): Int
}