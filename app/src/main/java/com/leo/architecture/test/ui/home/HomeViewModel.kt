package com.leo.architecture.test.ui.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.leo.architecture.test.data.api.GankApiRepository
import com.leo.architecture.test.ui.base.BaseViewModel
import io.reactivex.SingleObserver
import io.reactivex.disposables.Disposable

class HomeViewModel : BaseViewModel() {

    public var messageLiveData: MutableLiveData<String?> = MutableLiveData<String?>()
//    var message: ObservableField<String?> = ObservableField()

    fun setMessageText(str: String) {
//        message.set(str)
        messageLiveData.value = str
//        Log.i("aaaaaaaaaaaa","message: $message")
        Log.i("aaaaaaaaaaaa", "message: $messageLiveData.value")
    }

    fun getBanners() {
        setMessageText("125468")
        GankApiRepository.getBanners()
            .subscribe(singleObserver({
                setMessageText("${it.status}")
            }, {
                println(it.message)
            }))
    }




}