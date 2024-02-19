package com.example.android.dagger.di

import android.app.Application
import com.example.android.dagger.di.module.ContextModule
import com.example.android.dagger.helper.ResourceHelperImpl
import com.example.core.common.di.CoreComponent
import com.example.core.common.di.DaggerCoreComponent
import com.example.core.common.di.module.CoreModule

class Dagger {
    companion object {
        @JvmField
        var appComponent: AppComponent? = null

        @JvmField
        var coreComponent: CoreComponent? = null

        @JvmStatic
        fun initialize(app: Application): AppComponent {
            coreComponent = DaggerCoreComponent
                .builder()
                .coreModule(CoreModule(app.applicationContext, ResourceHelperImpl()))
                .build()

            appComponent = DaggerAppComponent
                .builder()
                .contextModule(ContextModule(app.applicationContext))
                .coreComponent(requireNotNull(coreComponent))
                .build()

            return requireNotNull(appComponent)
        }
    }
}