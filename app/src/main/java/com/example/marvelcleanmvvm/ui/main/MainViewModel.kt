package com.example.marvelcleanmvvm.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _goToDetail = MutableLiveData<Int>()
    val goToDetail: LiveData<Int> get() = _goToDetail

    private val _showProgress = MutableLiveData<Boolean>()
    val showProgress: LiveData<Boolean> get() = _showProgress

    init {
        _showProgress.value = false
    }

    fun onClickCharacter() {
        _goToDetail.value = 3
    }
}