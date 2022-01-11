package com.example.homework2.extantionce

import android.content.Context
import android.widget.Toast

fun Context.showToast(shop: String){
    Toast.makeText(this, shop, Toast.LENGTH_SHORT).show()
}