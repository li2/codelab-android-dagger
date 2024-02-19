package com.example.feature.login.di

import com.example.core.common.di.scope.ActivityScope
import com.example.feature.login.LoginActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class LoginActivityModule {
    @ActivityScope
    @ContributesAndroidInjector
    abstract fun loginActivity(): LoginActivity
}