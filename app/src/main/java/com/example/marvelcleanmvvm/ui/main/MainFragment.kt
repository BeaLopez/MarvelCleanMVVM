package com.example.marvelcleanmvvm.ui.main

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.marvelcleanmvvm.R
import com.example.marvelcleanmvvm.databinding.FragmentMainBinding
import com.example.marvelcleanmvvm.ui.common.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : BaseFragment<FragmentMainBinding>() {

    private val viewModel: MainViewModel by viewModels()

    override fun attachObserver() {
        viewModel.goToDetail.observe(viewLifecycleOwner, {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToDetailFragment())
        })
    }

    override fun setVariablesToDataBinding() {
        mViewDataBinding.mViewModel = viewModel
    }

    override fun getLayoutId() = R.layout.fragment_main
}