package com.example.feature.registration.di;

import com.example.core.common.di.FragmentScope;
import com.example.feature.registration.termsandconditions.TermsAndConditionsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      RegistrationFragmentModule_TermsAndConditionsFragment.TermsAndConditionsFragmentSubcomponent
          .class
)
public abstract class RegistrationFragmentModule_TermsAndConditionsFragment {
  private RegistrationFragmentModule_TermsAndConditionsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(TermsAndConditionsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TermsAndConditionsFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface TermsAndConditionsFragmentSubcomponent
      extends AndroidInjector<TermsAndConditionsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TermsAndConditionsFragment> {}
  }
}
