package com.klap.be.data.repository

import com.klap.be.data.models.ReceiptRequest
import com.klap.be.data.models.ReceiptResponse
import retrofit2.Response

interface ReceiptRemote {

    suspend fun generateBeKlap(data: ReceiptRequest, token: String): Response<ReceiptResponse>
}