package com.klap.be.data.models

import com.google.gson.annotations.SerializedName

data class ReceiptRequest(
    @SerializedName("terminal_klap")
    val terminalKlap: String,

    @SerializedName("terminal_comercio")
    val terminalCommerce: String? = null,

    @SerializedName("tipo")
    val type: String,

    @SerializedName("fecha_hora")
    val dateSent: String,

    @SerializedName("monto_total")
    val totalAmount: String,

    @SerializedName("medio_pago")
    val paymentType: String,

    @SerializedName("id_transaccion")
    val transactionId: String,

    @SerializedName("id_autorizacion")
    val authorizationCode: String,

    @SerializedName("envio_mail")
    val isActiveEmail: Boolean,

    @SerializedName("email")
    val email: String,

    @SerializedName("id_relacion_venta")
    val salesReferenceCode: String
)