package com.mathematicsoperationdemo.util

import android.content.Context
import android.widget.Toast

fun Context.showToast(message: CharSequence){
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}
