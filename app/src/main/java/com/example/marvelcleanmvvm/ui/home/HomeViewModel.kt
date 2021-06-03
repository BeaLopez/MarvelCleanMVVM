package com.example.marvelcleanmvvm.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _goToDetail = MutableLiveData<Int>()
    val goToDetail: LiveData<Int> get() = _goToDetail

    fun onClickCharacter() {
        _goToDetail.value = 3
    }
}