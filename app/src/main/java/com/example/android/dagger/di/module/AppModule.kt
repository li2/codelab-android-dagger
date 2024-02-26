package com.example.android.dagger.di.module

import com.example.android.dagger.helper.ResourceHelperImpl
import com.example.core.common.helper.ResourceHelper
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [AppModule.BindsModule::class])
@InstallIn(SingletonComponent::class)
class AppModule {
    @Module
    interface BindsModule {
        @Binds
        fun bindsResourceHelper(resourceHelper: ResourceHelperImpl): ResourceHelper
    }
}