package com.example.android.dagger.registration.di

import com.example.android.dagger.di.FragmentScope
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
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