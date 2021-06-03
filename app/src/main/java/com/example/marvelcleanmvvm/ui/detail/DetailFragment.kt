package com.example.marvelcleanmvvm.ui.detail

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.marvelcleanmvvm.R
import com.example.marvelcleanmvvm.databinding.FragmentDetailBinding
import com.example.marvelcleanmvvm.ui.common.base.BaseFragment

class DetailFragment : BaseFragment<FragmentDetailBinding>() {

    private lateinit var viewModel: DetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DetailViewModel::class.java)
    }

    override fun attachObserver() {}

    override fun setVariablesToDataBinding() {}

    override fun getLayoutId() = R.layout.fragment_detail

}