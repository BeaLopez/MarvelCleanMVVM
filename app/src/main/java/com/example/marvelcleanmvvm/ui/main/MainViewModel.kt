package com.example.marvelcleanmvvm.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.usecases.GetCharacterListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val getCharacterListUseCase: GetCharacterListUseCase) :
    ViewModel() {

    private val _goToDetail = MutableLiveData<Int>()
    val goToDetail: LiveData<Int> get() = _goToDetail

    private val _showProgress = MutableLiveData<Boolean>()
    val showProgress: LiveData<Boolean> get() = _showProgress

    init {
        _showProgress.value = true
        viewModelScope.launch {
            getCharacterListUseCase.invoke()
            _showProgress.postValue(false)
        }
    }

    fun onClickCharacter() {
        _goToDetail.value = 3
    }
}