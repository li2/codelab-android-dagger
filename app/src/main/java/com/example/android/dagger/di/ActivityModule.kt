package com.example.android.dagger.di

import com.example.android.dagger.login.LoginActivity
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.di.RegistrationFragmentModule
import com.example.android.dagger.settings.SettingsActivity
import com.example.android.dagger.user.LoggedUserScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [RegistrationFragmentModule::class])
    abstract fun registrationActivity(): RegistrationActivity

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun loginActivity(): LoginActivity

    @LoggedUserScope
    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity

    @LoggedUserScope
    @ContributesAndroidInjector
    abstract fun settingsActivity(): SettingsActivity
}