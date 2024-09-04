package com.klap.data.be.data.repository

import com.klap.data.be.data.source.ReceiptFactory
import com.klap.data.be.domain.ReceiptRepository
import javax.inject.Inject


class ReceiptDataRepository @Inject constructor(private val remote: ReceiptFactory): ReceiptRepository, BaseRe {
    fun getRemote(): ReceiptRemote = remote
}
