package com.klap.be.data.source

import com.klap.be.data.repository.ReceiptRemote
import javax.inject.Inject

class ReceiptFactory @Inject constructor(private val remote: ReceiptRemote) {
    fun getRemote(): ReceiptRemote = remote
}