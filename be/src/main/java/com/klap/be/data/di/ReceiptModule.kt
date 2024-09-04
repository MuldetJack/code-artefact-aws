package com.klap.data.be.data.di

import com.klap.data.be.data.remote.ReceiptBeApi
import com.klap.data.be.data.remote.ReceiptRemoteImpl
import com.klap.data.be.data.repository.ReceiptRemote
import com.klap.data.be.domain.ReceiptRepository
import com.klap.data.be.network.RetrofitWebServiceFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class ReceiptModule {
    /*
    @Provides
    @Singleton
    fun providerReceiptAPI(): ReceiptBeApi =
        RetrofitWebServiceFactory<ReceiptBeApi>().create(
            isDebug = BuildConfig.DEBUG,
            tClass = ReceiptBeApi::class.java,
            baseUrl = BuildConfig.URL_SERVICIOS
        )

    @Provides
    fun providerReceiptImpl(remoteImpl: ReceiptRemoteImpl): ReceiptRemote = remoteImpl


    @Provides
    fun bindDataRepository(dataRepository: ReceiptDataRepository): ReceiptRepository =
        dataRepository


     */
}