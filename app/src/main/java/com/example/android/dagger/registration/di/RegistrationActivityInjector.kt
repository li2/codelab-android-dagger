package com.example.android.dagger.registration.di

import com.example.android.dagger.di.ActivityScope
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragmentInjectorModule
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragmentInjectorModule
import dagger.Binds
import dagger.Module
import dagger.Subcomponent
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

// After defining the subcomponent, add it to your component hierarchy
// by defining a module that binds the subcomponent factory.
@Module(
    subcomponents = [RegistrationActivitySubcomponent::class],
)
abstract class RegistrationActivityInjectorModule {
    @Binds
    @IntoMap
    @ClassKey(RegistrationActivity::class)
    abstract fun bind(factory: RegistrationActivitySubcomponent.Factory): AndroidInjector.Factory<*>?
}

@ActivityScope
@Subcomponent(
    modules = [
        EnterDetailsFragmentInjectorModule::class,
        TermsAndConditionsFragmentInjectorModule::class,
    ]
)
interface RegistrationActivitySubcomponent : AndroidInjector<RegistrationActivity> {
    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<RegistrationActivity>
}
