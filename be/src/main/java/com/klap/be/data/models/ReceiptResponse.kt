package com.klap.data.be.data.models

import com.google.gson.annotations.SerializedName

data class ReceiptResponse(
    @SerializedName("date")
    val date: String,

    @SerializedName("time")
    val time: String,

    @SerializedName("responseCode")
    val responseCode: String,

    @SerializedName("responseMessage")
    val responseMessage: String,

    @SerializedName("data")
    val data: Data

)