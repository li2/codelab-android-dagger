package com.example.core.common.di.module

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class CoreModule(private val context: Context) {
    @Provides
    fun provideAppContext(): Context = context
}