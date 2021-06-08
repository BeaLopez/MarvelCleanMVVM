package com.example.marvelcleanmvvm.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.marvelcleanmvvm.ui.common.base.BaseViewModel
import com.example.usecases.GetCharacterListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getCharacterListUseCase: GetCharacterListUseCase) :
    BaseViewModel() {

    private val _goToDetail = MutableLiveData<Int>()
    val goToDetail: LiveData<Int> get() = _goToDetail

    private val _showProgress = MutableLiveData<Boolean>()
    val showProgress: LiveData<Boolean> get() = _showProgress

    private val _text = MutableLiveData<String>()
    val text: LiveData<String> get() = _text

    init {
        _showProgress.value = true
        viewModelScope.launch() {
            val result = getCharacterListUseCase.invoke()
            if(result.isSuccess) {
                _text.postValue(result.getOrNull()?.get(3)?.name)
            } else {
                _text.postValue(result.exceptionOrNull()?.message)
            }
            _showProgress.postValue(false)
        }
    }

    fun onClickCharacter() {
        _goToDetail.value = 3
    }
}