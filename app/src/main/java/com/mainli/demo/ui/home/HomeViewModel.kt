package com.mainli.demo.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    private val _imageUrl = MutableLiveData<String>().apply {
        value = "https://alifei05.cfp.cn/creative/vcg/veer/1600water/veer-167645584.jpg"
    }
    val imageUrl: LiveData<String> = _imageUrl
}