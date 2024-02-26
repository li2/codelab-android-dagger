package com.example.android.dagger.di

/*
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
                .coreComponent(requireNotNull(coreComponent))
                .build()

            return requireNotNull(appComponent)
        }
    }
}*/
