package com.kibster.android.databindextensions

import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.BindingAdapter

@BindingAdapter("android:text")
fun TextView.bindTextResource(resId: Int?) {
    resId?.let {
        text = context.getString(resId)
    }
}

@BindingAdapter("android:fontFamily")
fun TextView.bindFontResource(resId: Int?) {
    resId?.let {
        typeface = ResourcesCompat.getFont(context, resId)
    }
}

@BindingAdapter("android:textColor")
fun TextView.bindTextColorResource(resId: Int?) {
    resId?.let {
        setTextColor(ContextCompat.getColor(context, resId))
    }
}