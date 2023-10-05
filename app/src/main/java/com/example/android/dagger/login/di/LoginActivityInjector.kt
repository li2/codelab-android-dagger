package com.example.android.dagger.login.di

import com.example.android.dagger.di.ActivityScope
import com.example.android.dagger.login.LoginActivity
import dagger.Binds
import dagger.Module
import dagger.Subcomponent
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

// After defining the subcomponent, add it to your component hierarchy
// by defining a module that binds the subcomponent factory.
@Module(
    subcomponents = [LoginActivitySubcomponent::class],
)
abstract class LoginActivityInjectorModule {
    @Binds
    @IntoMap
    @ClassKey(LoginActivity::class)
    abstract fun bind(factory: LoginActivitySubcomponent.Factory): AndroidInjector.Factory<*>?
}

@ActivityScope
@Subcomponent
interface LoginActivitySubcomponent : AndroidInjector<LoginActivity> {
    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<LoginActivity>
}