package com.klap.data.be.data.source

import com.klap.data.be.data.repository.ReceiptRemote
import javax.inject.Inject

class ReceiptFactory @Inject constructor(private val remote: ReceiptRemote) {
    fun getRemote(): ReceiptRemote = remote
}