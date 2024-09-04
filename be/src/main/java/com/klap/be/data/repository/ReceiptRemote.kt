package com.klap.data.be.data.repository

import com.klap.data.be.data.models.ReceiptRequest
import com.klap.data.be.data.models.ReceiptResponse
import retrofit2.Response

interface ReceiptRemote {

    suspend fun generateBeKlap(data: ReceiptRequest, token: String): Response<ReceiptResponse>
}