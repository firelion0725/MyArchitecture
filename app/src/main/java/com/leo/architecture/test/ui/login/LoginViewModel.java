package com.leo.architecture.test.ui.login;

import android.app.Application;
import android.content.Intent;

import androidx.lifecycle.MutableLiveData;

import com.leo.architecture.test.MainActivity;
import com.leo.architecture.test.ui.base.BaseViewModel;

/**
 * @author Leo.ZhangTJ
 * @time 2020/5/11
 * @function
 * @describe
 */
public class LoginViewModel extends BaseViewModel {

    public LoginViewModel(Application application) {
        super(application);
        init();
    }

    private void init() {
        loginLiveData.setValue("");
    }

    public MutableLiveData<String> loginLiveData = new MutableLiveData<>();

    public void gotoMain() {
        Intent intent = new Intent(getApp(), MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getApp().startActivity(intent);
    }

}
