package com.example.feature.registration.di

import com.example.core.common.di.FragmentScope
import com.example.feature.registration.enterdetails.EnterDetailsFragment
import com.example.feature.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class RegistrationFragmentModule {
    @FragmentScope
    @ContributesAndroidInjector
    abstract fun enterDetailsFragment(): EnterDetailsFragment

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun termsAndConditionsFragment(): TermsAndConditionsFragment
}