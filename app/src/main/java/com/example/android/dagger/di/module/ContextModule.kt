package com.example.android.dagger.di.module

import android.content.Context
import com.example.core.common.di.scope.AppScope
import dagger.Module
import dagger.Provides

@Module
class ContextModule(private val context: Context) {
    @Provides
    @AppScope
    fun provideAppContext(): Context = context
}