package com.klap.be.base

import com.klap.be.base.exceptions.EndpointNotFoundException
import com.klap.be.base.exceptions.Logger
import com.klap.be.base.exceptions.NoConnectionException
import com.klap.be.base.exceptions.RepositoryException
import com.klap.be.base.exceptions.UnknownRepositoryException
import retrofit2.HttpException
import java.io.IOException
import java.net.InetAddress

abstract class BaseRepository {

    companion object {
        private const val ERROR_404 = 404
        private const val SESSION_EXPIRED_CODE = -11001022
    }

    suspend fun <T> safe(execution: suspend () -> T): T {
        return try {
            val result = execution()
            result
        } catch (ex: Exception) {
            ex.printStackTrace()
            when (ex) {
                is IOException -> {
                    if (hasInternet()) {
                        Logger.error("Inaccessible: ${ex.message.orEmpty()}")
                        throw RepositoryException(ex.hashCode(), ex.message.orEmpty())
                    } else {
                        Logger.error("No internet connection: ${ex.message.orEmpty()}")
                        throw NoConnectionException
                    }
                }

                is HttpException -> {
                    val message = ex.localizedMessage ?: ex.message()
                    Logger.error("Network call error: Code: ${ex.code()} Message: $message")
                    throw handleCodeErrors(ex.code(), message)
                }

                is RepositoryException -> throw ex
                else -> throw UnknownRepositoryException
            }
        }
    }

    private fun hasInternet(): Boolean {
        return try {
            !InetAddress.getByName("google.com").equals("")
        } catch (ex: Exception) {
            false
        }
    }

    open suspend fun handleCodeErrors(code: Int, message: String): Throwable {
        return when (code) {
            ERROR_404 -> EndpointNotFoundException(code)
            else -> RepositoryException(code, message)
        }
    }
}