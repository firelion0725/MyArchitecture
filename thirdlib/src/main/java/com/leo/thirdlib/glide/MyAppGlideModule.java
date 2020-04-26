package com.leo.thirdlib.glide;

import android.content.Context;
import android.util.Log;

import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;

import org.jetbrains.annotations.NotNull;

/**
 * @author Leo.ZhangTJ
 * @time 2020/4/22
 * @function
 * @describe
 */
@GlideModule
public class MyAppGlideModule extends AppGlideModule {
    @Override
    public void applyOptions(@NotNull Context context, GlideBuilder builder) {
        builder.setLogLevel(Log.VERBOSE);
    }
}
