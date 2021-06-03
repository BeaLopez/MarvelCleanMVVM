package com.example.marvelcleanmvvm.ui.main

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.marvelcleanmvvm.R
import com.example.marvelcleanmvvm.databinding.FragmentMainBinding
import com.example.marvelcleanmvvm.ui.common.base.BaseFragment

class MainFragment : BaseFragment<FragmentMainBinding>() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun attachObserver() {
        viewModel.goToDetail.observe(viewLifecycleOwner, {
            findNavController().navigate(MainFragmentDirections.actionHomeFragmentToDetailFragment())
        })
    }

    override fun setVariablesToDataBinding() {
        mViewDataBinding.mViewModel = viewModel
    }

    override fun getLayoutId() = R.layout.fragment_main
}