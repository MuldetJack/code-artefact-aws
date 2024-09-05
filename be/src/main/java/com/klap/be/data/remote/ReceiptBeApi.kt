package com.klap.be.data.remote

import com.klap.be.data.models.ReceiptRequest
import com.klap.be.data.models.ReceiptResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface ReceiptBeApi {

    @POST(value = "/central/cdb/recepcion/boletas/v1/send")
    suspend fun generateBeKlap(
        @Header("Authorization") token: String,
        @Body body: ReceiptRequest
    ): Response<ReceiptResponse>
}