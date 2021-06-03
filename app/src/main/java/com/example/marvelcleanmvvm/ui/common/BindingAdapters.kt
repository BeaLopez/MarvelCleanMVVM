package com.example.marvelcleanmvvm.ui.common

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("visibleIf")
fun View.bindVisibleIf(visible: Boolean) {
    this.visibility = if (visible) View.VISIBLE else View.GONE
}