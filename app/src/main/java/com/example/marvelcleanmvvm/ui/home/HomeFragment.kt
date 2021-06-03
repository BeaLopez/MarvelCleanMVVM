package com.example.marvelcleanmvvm.ui.home

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.example.marvelcleanmvvm.R
import com.example.marvelcleanmvvm.databinding.HomeFragmentBinding
import com.example.marvelcleanmvvm.ui.common.base.BaseFragment

class HomeFragment : BaseFragment<HomeFragmentBinding>() {

    private lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
    }

    override fun attachObserver() {
        viewModel.goToDetail.observe(viewLifecycleOwner, {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToDetailFragment())
        })
    }

    override fun setVariablesToDataBinding(dataBinding: HomeFragmentBinding) {
        dataBinding.mViewModel = viewModel
    }

    override fun getLayoutId() = R.layout.home_fragment
}