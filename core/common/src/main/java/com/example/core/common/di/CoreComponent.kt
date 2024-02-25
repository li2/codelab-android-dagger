package com.example.core.common.di

import com.example.core.common.di.module.CoreModule
import com.example.core.common.di.module.StorageModule
import com.example.core.common.helper.ResourceHelper
import com.example.core.common.logger.Logger
import com.example.core.common.storage.Storage
import com.example.core.common.user.UserManager
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [CoreModule::class, StorageModule::class],
)
interface CoreComponent {
    @Component.Builder
    interface Builder {
        fun coreModule(coreModule: CoreModule): Builder
        fun build(): CoreComponent
    }

    fun storage(): Storage
    fun userManager(): UserManager
    fun resourceHelper(): ResourceHelper
    fun logger(): Logger
}