package com.example.android.dagger.di

import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import com.example.android.dagger.user.LoggedUserScope
import com.example.feature.login.di.LoginActivityModule
import com.example.feature.registration.di.RegistrationActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(
    includes = [
        RegistrationActivityModule::class,
        LoginActivityModule::class,
    ]
)
abstract class ActivityModule {
    @LoggedUserScope
    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity

    @LoggedUserScope
    @ContributesAndroidInjector
    abstract fun settingsActivity(): SettingsActivity
}