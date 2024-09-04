package com.klap.data.be.base.exceptions

private const val MESSAGE: String = "Session not created"
private const val CODE = 401

object NoSessionDetectedException : RepositoryException(CODE, MESSAGE)