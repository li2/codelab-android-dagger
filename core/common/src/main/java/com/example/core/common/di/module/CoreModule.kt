package com.example.core.common.di.module

import android.content.Context
import com.example.core.common.helper.ResourceHelper
import com.example.core.common.logger.DefaultLogger
import com.example.core.common.logger.Logger
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CoreModule(
    private val context: Context,
    private val resourceHelper: ResourceHelper,
) {
    @Provides
    @Singleton
    fun provideAppContext(): Context = context

    @Provides
    @Singleton
    fun providesResourceHelper(): ResourceHelper = resourceHelper

    @Provides
    @Singleton
    fun providesLogger(): Logger = DefaultLogger(context)
}