package com.leo.architecture.test.ndk;

/**
 * @author Leo.ZhangTJ
 * @time 2020/4/28
 * @function
 * @describe
 */
public class TestNdk {
    static {
        System.loadLibrary("native-lib");
    }

    public static native String getStringFromC();

    public static native int getSum(int a, int b);
}
