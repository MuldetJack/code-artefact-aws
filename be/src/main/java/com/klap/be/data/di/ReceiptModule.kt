package com.klap.be.data.di

import com.klap.be.data.remote.ReceiptBeApi
import com.klap.be.data.remote.ReceiptRemoteImpl
import com.klap.be.data.repository.ReceiptDataRepository
import com.klap.be.data.repository.ReceiptRemote
import com.klap.be.domain.ReceiptRepository
import com.klap.be.network.RetrofitWebServiceFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ReceiptModule {

    @Provides
    @Singleton
    fun providerReceiptAPI(): ReceiptBeApi =
        RetrofitWebServiceFactory<ReceiptBeApi>().create(
            isDebug = false,//BuildConfig.DEBUG,
            tClass = ReceiptBeApi::class.java,
            baseUrl = "https://verticalqa.mcdesaqa.cl" //BuildConfig.URL_SERVICIOS
        )

    @Provides
    fun providerReceiptImpl(remoteImpl: ReceiptRemoteImpl): ReceiptRemote = remoteImpl


    @Provides
    fun bindDataRepository(dataRepository: ReceiptDataRepository): ReceiptRepository =
        dataRepository


}