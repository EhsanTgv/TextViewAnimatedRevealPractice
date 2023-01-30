package com.taghavi.text_view_vertical_reveal.extensions

import android.view.View

fun View.updateHeight(newHeight: Int) {
    layoutParams = layoutParams.apply {
        height = newHeight
    }
}