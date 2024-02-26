package com.example.core.common.di.module

import com.example.core.common.logger.DefaultLogger
import com.example.core.common.logger.Logger
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class LoggerModule {
    @Binds
    abstract fun bindsLogger(defaultLogger: DefaultLogger): Logger
}