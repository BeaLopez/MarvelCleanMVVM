package com.example.marvelcleanmvvm.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.marvelcleanmvvm.databinding.ActivityNavHostBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NavHostActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityNavHostBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityNavHostBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }
}