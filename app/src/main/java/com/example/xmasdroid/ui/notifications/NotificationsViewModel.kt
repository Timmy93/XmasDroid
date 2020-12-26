package com.example.xmasdroid.ui.notifications

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

//    //It's a getter for data
//    private val _text = MutableLiveData<String>().apply {
//        value = "This is notifications Fragment"
//    }
//    val text: LiveData<Array> = _text
//
//    fun updateInfo(info: String) {
//        text.value = info
//    }

    private val _news = MutableLiveData<ArrayList<News>>().apply {
        value = ArrayList<News>()
    }
    val news: MutableLiveData<ArrayList<News>> = this._news

    fun addNews(myNews: News) {
        Log.i("info","Provo ad aggiungerci una cacata")
        this.news.value?.add(myNews)
        Log.i("info", "Notizie presenti: " + (this.news.value?.size ?: 0))
    }

}