package com.klap.data.be.base.errors

import android.content.res.Resources

fun interface Translatable {
    fun getStringResource(resources: Resources): String
}