#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_leo_architecture_test_ndk_TestNdk_getStringFromC(JNIEnv *env, jclass clazz) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C"
JNIEXPORT jint JNICALL
Java_com_leo_architecture_test_ndk_TestNdk_getSum(JNIEnv *env, jclass clazz, jint a, jint b) {
    return a + b;
}