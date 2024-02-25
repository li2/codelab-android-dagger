package com.example.core.common.logger

import android.content.Context

interface Logger {
    fun i(message: String)
    fun d(message: String)
    fun e(message: String, tr: Throwable?)
}

class DefaultLogger(private val context: Context) : Logger {
    override fun i(message: String) {
        println("i:$message")
    }

    override fun d(message: String) {
        println("d:$message")
    }

    override fun e(message: String, tr: Throwable?) {
        println("e:$message:${tr?.message}")
    }
}