package com.klap.be.data.repository

import com.klap.be.base.BaseRepository
import com.klap.be.data.models.ReceiptRequest
import com.klap.be.data.models.ReceiptResponse
import com.klap.be.data.source.ReceiptFactory
import com.klap.be.domain.ReceiptRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import retrofit2.Response
import javax.inject.Inject

class ReceiptDataRepository @Inject constructor(private val factory: ReceiptFactory) :
    ReceiptRepository, BaseRepository() {
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO

    override suspend fun generateBeKlap(
        data: ReceiptRequest,
        token: String
    ): Response<ReceiptResponse> {
        return safe {
            coroutineScope {
                val response =
                    async(dispatcher) { factory.getRemote().generateBeKlap(data, token) }.await()
                return@coroutineScope response
            }
        }
    }
}
