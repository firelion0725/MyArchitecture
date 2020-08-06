package com.leo.architecture.test.ui.login;

import android.Manifest;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.leo.architecture.test.R;
import com.leo.architecture.test.databinding.ActivityLoginBinding;
import com.leo.architecture.test.ui.base.BaseArchitectureActivity;
import com.tbruyelle.rxpermissions2.RxPermissions;

import org.jetbrains.annotations.Nullable;

import io.reactivex.functions.Consumer;

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

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RxPermissions rxPermissions = new RxPermissions(this);
        rxPermissions.request(Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                .subscribe(aBoolean -> {
                    if (aBoolean) {
                        Log.i("aaaaaaaa","aaaaaaaaaa");
                    }
                });
    }
}
