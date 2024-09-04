package com.klap.data.be.base.exceptions

private const val MESSAGE: String = "Bad Credentials"
private const val CODE = 401

object WrongCredentialsException : RepositoryException(CODE, MESSAGE)