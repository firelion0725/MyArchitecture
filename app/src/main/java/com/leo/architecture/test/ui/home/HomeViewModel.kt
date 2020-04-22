package com.leo.architecture.test.ui.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.leo.architecture.test.data.api.GankApiRepository
import com.leo.architecture.test.data.comm.singleCompile
import com.leo.architecture.test.data.model.BannerTitleModel
import com.leo.architecture.test.ui.base.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException

class HomeViewModel : BaseViewModel() {

    var messageLiveData: MutableLiveData<String?> = MutableLiveData<String?>()

    fun setMessageText(str: String) {
        messageLiveData.value = str
        Log.i("aaaaaaaaaaaa", "message: ${messageLiveData.value}")
    }

    fun getBanners2() {
        GlobalScope.launch(Dispatchers.IO) {
            try {
                val data: BannerTitleModel = GankApiRepository.getBanners().blockingGet()
                withContext(Dispatchers.Main) {
                    setMessageText("${data.status}")
                }
            } catch (e: Exception) {
                if (e is HttpException) {
                    val httpException = handleHttpException(e, "getBanners")
                }
                println(e.message)
            }
        }
    }

    fun getBanners() {
        setMessageText("125468")
        GankApiRepository.getBanners()
            .compose(singleCompile())
            .subscribe(singleObserver({
                setMessageText("${it.status}")
            }, {
                println(it.message)
            }))
    }


}