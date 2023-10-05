package com.example.android.dagger.registration.termsandconditions

import com.example.android.dagger.di.FragmentScope
import dagger.Binds
import dagger.Module
import dagger.Subcomponent
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

// After defining the subcomponent, add it to your component hierarchy
// by defining a module that binds the subcomponent factory.
@Module(
    subcomponents = [TermsAndConditionsFragmentSubcomponent::class],
)
abstract class TermsAndConditionsFragmentInjectorModule {
    @Binds
    @IntoMap
    @ClassKey(TermsAndConditionsFragment::class)
    abstract fun bind(factory: TermsAndConditionsFragmentSubcomponent.Factory): AndroidInjector.Factory<*>?
}

@FragmentScope
@Subcomponent
interface TermsAndConditionsFragmentSubcomponent : AndroidInjector<TermsAndConditionsFragment> {
    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<TermsAndConditionsFragment>
}