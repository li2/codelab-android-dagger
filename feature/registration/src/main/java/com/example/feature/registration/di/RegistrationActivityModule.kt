package com.example.feature.registration.di

import com.example.core.common.di.scope.ActivityScope
import com.example.feature.registration.RegistrationActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class RegistrationActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [RegistrationFragmentModule::class])
    abstract fun registrationActivity(): RegistrationActivity
}