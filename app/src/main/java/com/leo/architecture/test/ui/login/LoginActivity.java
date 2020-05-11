package com.leo.architecture.test.ui.login;

import com.leo.architecture.test.R;
import com.leo.architecture.test.databinding.ActivityLoginBinding;
import com.leo.architecture.test.ui.base.BaseArchitectureActivity;

/**
 * @author Leo.ZhangTJ
 * @time 2020/5/11
 * @function
 * @describe
 */
public class LoginActivity extends BaseArchitectureActivity<ActivityLoginBinding, LoginViewModel> {
    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }
}
