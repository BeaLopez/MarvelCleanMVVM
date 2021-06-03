package com.example.marvelcleanmvvm.ui.detail

import android.os.Bundle
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.marvelcleanmvvm.R
import com.example.marvelcleanmvvm.databinding.FragmentDetailBinding
import com.example.marvelcleanmvvm.ui.common.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailFragment : BaseFragment<FragmentDetailBinding>() {

    private val viewModel: DetailViewModel by viewModels()

    override fun attachObserver() {}

    override fun setVariablesToDataBinding() {}

    override fun getLayoutId() = R.layout.fragment_detail

}