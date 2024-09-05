package com.klap.be.base.errors

import android.content.res.Resources

fun interface Translatable {
    fun getStringResource(resources: Resources): String
}