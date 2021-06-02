package com.example.marvelcleanmvvm.ui.main

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.marvelcleanmvvm.databinding.ActivityMainBinding
import com.example.marvelcleanmvvm.ui.base.BaseActivity

class MainActivity : BaseActivity() {

    private lateinit var mViewModel: MainViewModel
    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mViewModel = ViewModelProvider(this).get()
        mBinding.mViewModel = mViewModel

    }
}