package com.example.marvelcleanmvvm.ui.detail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import com.example.marvelcleanmvvm.R
import com.example.marvelcleanmvvm.databinding.DetailFragmentBinding
import com.example.marvelcleanmvvm.ui.common.base.BaseFragment
import com.example.marvelcleanmvvm.ui.home.HomeViewModel

class DetailFragment : BaseFragment<DetailFragmentBinding>() {

    private lateinit var viewModel: HomeViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
    }

    override fun attachObserver() {}

    override fun setVariablesToDataBinding(dataBinding: DetailFragmentBinding) {}

    override fun getLayoutId() = R.layout.detail_fragment

}