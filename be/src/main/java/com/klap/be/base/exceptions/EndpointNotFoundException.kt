package com.klap.be.base.exceptions

private const val MESSAGE: String = "Endpoint call not found exception"

class EndpointNotFoundException(code: Int) : RepositoryException(code, MESSAGE)