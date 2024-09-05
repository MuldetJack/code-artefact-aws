package com.klap.be.data.remote

import com.klap.be.data.models.ReceiptRequest
import com.klap.be.data.models.ReceiptResponse
import com.klap.be.data.repository.ReceiptRemote
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