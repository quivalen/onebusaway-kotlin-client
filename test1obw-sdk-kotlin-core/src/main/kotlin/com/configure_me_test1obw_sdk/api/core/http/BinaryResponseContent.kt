package com.configure_me_test1obw_sdk.api.core.http

import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.lang.AutoCloseable

interface BinaryResponseContent : AutoCloseable {

    fun contentType(): String?

    fun body(): InputStream

    @Throws(IOException::class) fun writeTo(outputStream: OutputStream)
}
