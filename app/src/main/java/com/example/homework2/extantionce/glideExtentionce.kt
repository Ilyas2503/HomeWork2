package com.example.homework2.extantionce

import android.widget.ImageView
import com.bumptech.glide.Glide

fun  ImageView.load(uri: String) {
    Glide.with(this).load(uri).into(this)
}