package com.klap.data.be.data.remote

import com.klap.data.be.data.models.ReceiptRequest
import com.klap.data.be.data.models.ReceiptResponse
import com.klap.data.be.data.repository.ReceiptRemote
import retrofit2.Response
import javax.inject.Inject

class ReceiptRemoteImpl @Inject constructor(private val api: ReceiptBeApi) : ReceiptRemote {

    override suspend fun generateBeKlap(
        data: ReceiptRequest,
        token: String
    ): Response<ReceiptResponse> {
        return api.generateBeKlap(token = token, body = data)
    }
}