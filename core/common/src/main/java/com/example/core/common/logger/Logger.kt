package com.example.core.common.logger

import android.content.Context
import android.util.Log

interface Logger {
    fun i(message: String)
    fun d(message: String)
    fun e(message: String, tr: Throwable?)
}

class DefaultLogger(private val context: Context) : Logger {
    override fun i(message: String) {
        Log.i("Logger", "i:$message")
    }

    override fun d(message: String) {
        Log.d("Logger", "d:$message")
    }

    override fun e(message: String, tr: Throwable?) {
        Log.e("Logger", "e:$message", tr)
    }
}