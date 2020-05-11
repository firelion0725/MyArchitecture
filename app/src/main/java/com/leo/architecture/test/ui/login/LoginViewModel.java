package com.leo.architecture.test.ui.login;

import androidx.lifecycle.MutableLiveData;

import com.leo.architecture.test.ui.base.BaseViewModel;

/**
 * @author Leo.ZhangTJ
 * @time 2020/5/11
 * @function
 * @describe
 */
public class LoginViewModel extends BaseViewModel {

    public LoginViewModel() {
        init();
    }

    private void init() {
        loginLiveData.setValue("");
    }

    public MutableLiveData<String> loginLiveData = new MutableLiveData<>();


}
