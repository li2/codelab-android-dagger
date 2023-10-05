package com.example.android.dagger.registration.enterdetails

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
    subcomponents = [EnterDetailsFragmentSubcomponent::class],
)
abstract class EnterDetailsFragmentInjectorModule {
    @Binds
    @IntoMap
    @ClassKey(EnterDetailsFragment::class)
    abstract fun bind(factory: EnterDetailsFragmentSubcomponent.Factory): AndroidInjector.Factory<*>?
}

@FragmentScope
@Subcomponent
interface EnterDetailsFragmentSubcomponent : AndroidInjector<EnterDetailsFragment> {
    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<EnterDetailsFragment>
}