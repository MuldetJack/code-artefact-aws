package com.klap.data.be.domain

import com.klap.data.be.data.models.ReceiptRequest
import com.klap.data.be.data.models.ReceiptResponse
import retrofit2.Response

interface ReceiptRepository {

    suspend fun generateBeKlap(data: ReceiptRequest, token: String): Response<ReceiptResponse>
}