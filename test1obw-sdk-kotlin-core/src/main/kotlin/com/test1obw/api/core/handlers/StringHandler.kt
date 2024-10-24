@file:JvmName("StringHandler")

package com.test1obw.api.core.handlers

import com.test1obw.api.core.http.HttpResponse
import com.test1obw.api.core.http.HttpResponse.Handler

internal fun stringHandler(): Handler<String> = StringHandlerInternal

private object StringHandlerInternal : Handler<String> {
    override fun handle(response: HttpResponse): String =
        response.body().readBytes().toString(Charsets.UTF_8)
}
