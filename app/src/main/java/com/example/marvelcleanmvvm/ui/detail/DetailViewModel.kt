package com.example.marvelcleanmvvm.ui.detail

import androidx.lifecycle.ViewModel
import com.example.marvelcleanmvvm.ui.common.base.BaseViewModel
import com.example.usecases.GetCharacterUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(private val getCharacterUseCase: GetCharacterUseCase) :
    BaseViewModel() {
}