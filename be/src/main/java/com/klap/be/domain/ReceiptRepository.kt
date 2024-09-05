package com.klap.be.domain

import com.klap.be.data.models.ReceiptRequest
import com.klap.be.data.models.ReceiptResponse
import retrofit2.Response

interface ReceiptRepository {

    suspend fun generateBeKlap(data: ReceiptRequest, token: String): Response<ReceiptResponse>
}