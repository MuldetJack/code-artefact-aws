package com.klap.be.data.models

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("codigoKlap")
    val klapCode: Long,
    @SerializedName("folio")
    val folioSequence: Int,
    @SerializedName("fechaHora")
    val date: String,
    @SerializedName("montoNeto")
    val netAmount: Int,
    @SerializedName("montoExento")
    val exemptAmount: Int,
    @SerializedName("montoIva")
    val taxAmount: Int,
    @SerializedName("monto_total")
    val totalAmount: Int,
    @SerializedName("nombreComercio")
    val commerceName: String,
    @SerializedName("razonSocial")
    val fantasyName: String,
    @SerializedName("giro")
    val economicActivity: String,
    @SerializedName("direccion")
    val address: String,
    @SerializedName("firma")
    val sign: String
)