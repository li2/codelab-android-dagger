package com.example.android.dagger.di

import com.example.android.dagger.login.LoginActivity
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.di.RegistrationFragmentModule
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
}